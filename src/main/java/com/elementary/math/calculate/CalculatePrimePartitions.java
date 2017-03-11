package com.elementary.math.calculate;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.elementary.math.utility.PrimaryFactors;

public class CalculatePrimePartitions {

	private BigInteger [] sopfTable;
	private BigInteger [] partitionTable;
	private int n;
	private static BigInteger ONE = new BigInteger("1");
	private static BigInteger ZERO = new BigInteger("0");

	public CalculatePrimePartitions(int n) {

		this.sopfTable = new BigInteger[n+1];
		this.partitionTable = new BigInteger[n+1];
		this.n = n;

	}

	public void execute() {

		for (int i = 0; i <= n; i++) {
			BigInteger primPart = primePartitions(i);
			if (i == n) {
				System.out.println(i + ":" + primPart);
			}
		}
	}

	public BigInteger primePartitions(int n) {

		if (n == 0)
			return ONE;
		else if (n == 1)
			return ZERO;
		else {

			BigInteger sum = ZERO;
			for (int j = 1; j < n; j++) {

				BigInteger sopf = sopfTable[j];
				BigInteger primePart = partitionTable[n - j];

				if (sopf == null) {
					sopf = sopf(j);
					sopfTable[j] = sopf;

				}
				if (primePart == null) {
					primePart = primePartitions(n - j);
					partitionTable[n - j] =primePart;
				}
				sum = sum.add(sopf.multiply(primePart));
			}

			BigInteger sopfN = sopfTable[n];
			if (sopfN == null) {
				sopfN = sopf(n);
				sopfTable[n] =sopfN;
			}
			return (sopfN.add(sum)).divide(new BigInteger(n + ""));

		}
	}

	public BigInteger sopf(int n) {
		Map<Integer, Integer> primFacts = PrimaryFactors.primFactors(n);
		long sum = 0;
		for (Entry<Integer, Integer> entry : primFacts.entrySet()) {

			sum = sum + entry.getKey();
		}

		return new BigInteger(sum + "");
	}
}
