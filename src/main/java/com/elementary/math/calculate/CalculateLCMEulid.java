package com.elementary.math.calculate;

import java.math.BigInteger;
import java.util.List;

import com.elementary.math.utility.RemoveDuplicates;

public class CalculateLCMEulid {

	private List<BigInteger> numbers;

	private BigInteger lcmR;

	public CalculateLCMEulid(List<Integer> numbers) {
		this.numbers = RemoveDuplicates.removeDuplicatesB(numbers);
	}

	public void execute() {

		lcmR = lcm(0, 1);
	}

	public BigInteger lcm(int a, int b) {

		if (b == numbers.size() - 1) {

			return (numbers.get(a).multiply(numbers.get(b))).divide(CalculateGCDEulid.gcd(
					numbers.get(a), numbers.get(b)));
		} else {

			numbers.set(b,
					(numbers.get(a).multiply(numbers.get(b))).divide(CalculateGCDEulid.gcd(
							numbers.get(a), numbers.get(b))));
			return lcm(b, b + 1);
		}

	}

	public BigInteger lcmResult() {
		return lcmR;
	}

}
