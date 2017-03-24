package com.elementary.math.calculate;

public class CalculateFactorial {

	public static long factorial(int n) {

		if (n == 1) {
			return 1;
		} else {

			long ans = n * factorial(n - 1);
			return ans;
		}

	}
}
