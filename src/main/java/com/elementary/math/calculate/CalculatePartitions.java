package com.elementary.math.calculate;

import java.math.BigInteger;

public class CalculatePartitions {

	private Long[] partitionTable;

	private BigInteger[] partitionTableBig;

	private int n;
	private static BigInteger ONE = new BigInteger("1");
	private static BigInteger ZERO = new BigInteger("0");
	private static BigInteger NEGONE = ONE.negate();

	public CalculatePartitions(int n) {
		this.partitionTableBig = new BigInteger[n + 1];
		this.partitionTable = new Long[n + 1];
		this.n = n;
	}

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

				Long leftSum = 0L;
				Long rightSum = 0L;

				if (nl >= 0) {

					leftSum = partitionTable[nl];
					if (leftSum == null) {
						leftSum = partitions(nl);
						partitionTable[nl] = leftSum;
					}
				}
				if (nr >= 0) {

					rightSum = partitionTable[nr];
					if (rightSum == null) {
						rightSum = partitions(nr);
						partitionTable[nr] = rightSum;
					} else {

						rightSum = partitionTable[nr];
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

	public BigInteger cardinalPartitions() {

		BigInteger answer = null;
		for (int i = 1; i <= n; i++) {

			if (i == n) {
				answer = partitionsBig(i);
			} else {
				partitionsBig(i);
			}

		}
		return answer;
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

					leftSum = partitionTableBig[nl];
					if (leftSum == null) {
						leftSum = partitionsBig(nl);
						partitionTableBig[nl] = leftSum;
					}
				}
				if (nr >= 0) {
					rightSum = partitionTableBig[nr];
					if (rightSum == null) {
						rightSum = partitionsBig(nr);
						partitionTableBig[nr] = rightSum;
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

	public void printPartitions() {
		//printPartitions("", n, n, 0, n);
	}

	public static void printPartitions(int n) {
		printPartitions("", n, n);
	}

	private static void printPartitions(String part, int max, int total) {

		if(total == 0){
			
			System.out.println(part);
		}
		else if(total<0){
			
			return;
		}
		else{
			
			for(int i=max; i>=1; i--){
				
				printPartitions(part + i + " ", i,total-i);
				
			}
			
			
		}
	}

	public static int p(int n) {
		int sum = 0;
		for (int k = 0; k <= n; k++) {

			sum = sum + p(n, k);
		}
		return sum;
	}

	public static int p(int n, int k) {
		if (n == k) {
			return 1;
		} else if (k > n || k == 0) {
			return 0;
		} else {

			return p(n - 1, k - 1) + p(n - k, k);

		}

	}
}
