package com.elementary.math.calculate;

import java.util.List;

import com.elementary.math.utility.RemoveDuplicates;

public class CalculateGCDEulid {

	private List<Integer> numbers;

	private Integer gcdR;
	public CalculateGCDEulid(List<Integer> numbers) {
		this.numbers = RemoveDuplicates.removeDuplicates(numbers);
	}

	public void execute() {

		gcdR = iterateNum(0, 1);

	}

	public int iterateNum(int a, int b) {

		if (b == numbers.size() - 1)
			return gcd(numbers.get(a), numbers.get(b));
		else {
			
			numbers.set(b, gcd(numbers.get(a), numbers.get(b)));
			return iterateNum(b, b+1);

		}
	}

	public static int gcd(int a, int b) {

		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
	public int gcdResult(){
		return gcdR;
	}
}
