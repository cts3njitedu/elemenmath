package com.elementary.math.calculate;

import java.util.List;

import com.elementary.math.utility.RemoveDuplicates;

public class CalculateLCMEulid {

	private List<Integer> numbers;

	private Integer lcmR;

	public CalculateLCMEulid(List<Integer> numbers) {
		this.numbers = RemoveDuplicates.removeDuplicates(numbers);
	}

	public void execute() {

		lcmR = lcm(0, 1);
	}

	public int lcm(int a, int b) {

		if (b == numbers.size() - 1) {

			return ((numbers.get(a) * numbers.get(b)) / CalculateGCDEulid.gcd(
					numbers.get(a), numbers.get(b)));
		} else {

			numbers.set(b,
					((numbers.get(a) * numbers.get(b)) / CalculateGCDEulid.gcd(
							numbers.get(a), numbers.get(b))));
			return lcm(b, b + 1);
		}

	}

	public int lcmResult() {
		return lcmR;
	}

}
