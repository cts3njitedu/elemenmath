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

		
		BigInteger lcm = new BigInteger(String.valueOf(numbers.get(0)));
		
		for(int i =1; i<numbers.size();i++){
			
			lcm = (lcm.multiply(numbers.get(i))).divide(CalculateGCDEulid.gcd(
					lcm, numbers.get(i)));
			
		}
		lcmR = lcm;
	}


	public BigInteger lcmResult() {
		return lcmR;
	}

}
