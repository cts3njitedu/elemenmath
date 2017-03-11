package com.elementary.math.calculate;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.elementary.math.utility.PrimaryFactors;

public class CalculatePrimePartitions {

	private Map<Integer, Integer> sopfTable;
	private Map<Integer, Integer> partitionTable;

	public CalculatePrimePartitions() {

		this.sopfTable = new HashMap<Integer, Integer>();
		this.partitionTable = new HashMap<Integer, Integer>();

	}

	public long primePartitions(int n) {

		if (n == 0)
			return 1;
		else if (n == 1)
			return 0;
		else {

			long sum = 0;
			for (int j = 1; j < n; j++) {

				sum = sum + sopf(j) * primePartitions(n - j);
			}
			
			return (sopf(n)+sum)/n;
		}
	}

	public long sopf(int n) {
		Map<Integer, Integer> primFacts = PrimaryFactors.primFactors(n);
		long sum = 0;
		for (Entry<Integer, Integer> entry : primFacts.entrySet()) {

			sum = sum + entry.getKey();
		}

		return sum;
	}
}
