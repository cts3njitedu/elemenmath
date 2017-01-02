package com.elementary.math.utility;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	
	
	public static List<Integer> removeDuplicates(List<Integer> numbers) {

		Set<Integer> uniqueNum = new HashSet<Integer>();
		for (Integer n : numbers) {

			uniqueNum.add(n);
		}
		List<Integer> uniqueNumbersL = new ArrayList<Integer>(uniqueNum);

		return uniqueNumbersL;
	}
	
	public static List<BigInteger> removeDuplicatesB(List<Integer> numbers) {

		Set<BigInteger> uniqueNum = new HashSet<BigInteger>();
		for (Integer n : numbers) {

			
			uniqueNum.add(new BigInteger(String.valueOf(n)));
		}
		List<BigInteger> uniqueNumbersL = new ArrayList<BigInteger>(uniqueNum);

		return uniqueNumbersL;
	}
}
