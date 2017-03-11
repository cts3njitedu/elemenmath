package com.elementary.math.calculate;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class CalculatePartitions {

	private Map<Integer, Long> partitionTable = new HashMap<Integer, Long>();

	private Map<Integer, BigInteger> partitionTableBig = new HashMap<Integer, BigInteger>();

	private static BigInteger ONE = new BigInteger("1");
	private static BigInteger ZERO = new BigInteger("0");
	private static BigInteger NEGONE = ONE.negate();

	public long partitions(int n) {

		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		}

		else {

			long sum = 0;

			for (int k = 1; k <= n; k++) {

				int nl = n - ((k * (3 * k - 1))) / 2;
				int nr = n - ((k * (3 * k + 1))) / 2;

				long leftSum = 0;
				long rightSum = 0;

				if (nl >= 0) {

					if (partitionTable.get(nl) == null) {
						leftSum = partitions(nl);
						partitionTable.put(nl, leftSum);
					} else {

						leftSum = partitionTable.get(nl);
					}
				}
				if (nr >= 0) {

					if (partitionTable.get(nr) == null) {
						rightSum = partitions(nr);
						partitionTable.put(nr, rightSum);
					} else {

						rightSum = partitionTable.get(nr);
					}
				}

				sum = sum + (long) Math.pow(-1, k + 1) * (leftSum + rightSum);
				if (leftSum == 0 || rightSum == 0) {
					return sum;
				}
			}
			return sum;
		}
	}

	public BigInteger partitionsBig(int n) {

		if (n == 0) {
			return ONE;
		} else {

			BigInteger sum = ZERO;

			for (int k = 1; k <= n; k++) {

				int nl = n - ((k * (3 * k - 1))) / 2;
				int nr = n - ((k * (3 * k + 1))) / 2;

				BigInteger leftSum = ZERO;
				BigInteger rightSum = ZERO;

				if (nl >= 0) {

					if (partitionTable.get(nl) == null) {
						leftSum = partitionsBig(nl);
						partitionTableBig.put(nl, leftSum);
					} else {

						leftSum = partitionTableBig.get(nl);
					}
				}
				if (nr >= 0) {

					if (partitionTableBig.get(nr) == null) {
						rightSum = partitionsBig(nr);
						partitionTableBig.put(nr, rightSum);
					} else {

						rightSum = partitionTableBig.get(nr);
					}
				}
				BigInteger constant = (NEGONE).pow(k + 1);
				sum = sum.add(constant.multiply(leftSum.add(rightSum)));
				if (leftSum.equals(ZERO) || rightSum.equals(ZERO)) {
					return sum;
				}

			}
			return sum;
		}
	}
}
