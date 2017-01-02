package com.elementary.math.calculate;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.elementary.math.utility.PrimaryFactors;
import com.elementary.math.utility.RemoveDuplicates;

public class CalculateGCD {

	private List<Integer> numbers;

	private Map<Integer, Integer> primaryFactors;

	private boolean visited = false;

	public CalculateGCD(List<Integer> numbers) {
		this.numbers = RemoveDuplicates.removeDuplicates(numbers);

		this.primaryFactors = new HashMap<Integer, Integer>();
	}

	public void execute() {

		for (Integer n : numbers) {

			smallestPrimaryFactors(PrimaryFactors.getPrimaryFactors(n));
		}

	}

	private void smallestPrimaryFactors(Map<Integer, Integer> primFact) {

		if (!visited) {

			for (Entry<Integer, Integer> entry : primFact.entrySet()) {

				primaryFactors.put(entry.getKey(), entry.getValue());
			}

		} else {
			Map<Integer,Integer> pFacts = new HashMap<Integer,Integer>(primaryFactors);
			for (Entry<Integer, Integer> entry : pFacts.entrySet()) {

				if (primFact.containsKey(entry.getKey())) {

					int currPrimExp = primaryFactors.get(entry.getKey());
					int newPrimExp = entry.getValue();

					if (newPrimExp < currPrimExp) {

						primaryFactors.put(entry.getKey(), newPrimExp);
					}

				} else {
					if (!visited)
						primaryFactors.put(entry.getKey(), entry.getValue());
					else
						primaryFactors.remove(entry.getKey());

				}

			}
		}
		visited = true;

	}

	public BigInteger gcdResult() {

		return PrimaryFactors.convertPrimaryFactors(primaryFactors);
	}
}
