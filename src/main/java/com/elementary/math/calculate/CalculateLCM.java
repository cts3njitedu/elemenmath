package com.elementary.math.calculate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.elementary.math.utility.PrimaryFactors;

public class CalculateLCM {

	private List<Integer> numbers;

	private Map<Integer, Integer> primaryFactors;


	public CalculateLCM(List<Integer> numbers) {
		this.numbers = numbers;

		this.primaryFactors = new HashMap<Integer, Integer>();
	}

	public void execute() {

		calculateLCM(removeDuplicates());
	}

	private Set<Integer> removeDuplicates() {

		Set<Integer> uniqueNum = new HashSet<Integer>();
		for (Integer n : numbers) {

			uniqueNum.add(n);
		}

		return uniqueNum;
	}

	private void calculateLCM(Set<Integer> uniqueNumbers) {

		for (Integer n : uniqueNumbers) {

			largestPrimaryFactors(PrimaryFactors.getPrimaryFactors(n));
		}

	}

	private void largestPrimaryFactors(Map<Integer, Integer> primFact) {

		for (Entry<Integer, Integer> entry : primFact.entrySet()) {

			if (primaryFactors.containsKey(entry.getKey())) {

				int currPrimExp = primaryFactors.get(entry.getKey());
				int newPrimExp = entry.getValue();

				if (newPrimExp > currPrimExp) {

					primaryFactors.put(entry.getKey(), newPrimExp);
				}

			} else {
				primaryFactors.put(entry.getKey(), entry.getValue());

			}

		}
	}

	public int lcmResult() {

		
		return PrimaryFactors.convertPrimaryFactors(primaryFactors);
	}

}
