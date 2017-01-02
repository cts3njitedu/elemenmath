package com.elementary.math.calculate;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.elementary.math.utility.PrimaryFactors;
import com.elementary.math.utility.RemoveDuplicates;

public class CalculateLCM {

	private List<Integer> numbers;

	private Map<Integer, Integer> primaryFactors;


	public CalculateLCM(List<Integer> numbers) {
		this.numbers = RemoveDuplicates.removeDuplicates(numbers);

		this.primaryFactors = new HashMap<Integer, Integer>();
	}

	public void execute() {

		calculateLCM();
	}


	private void calculateLCM() {

		
		for (Integer n : numbers) {

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

	public BigInteger lcmResult() {

		
		return PrimaryFactors.convertPrimaryFactors(primaryFactors);
	}

}
