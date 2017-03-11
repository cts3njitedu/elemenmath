package com.elementary.math.demo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.elementary.math.calculate.CalculateGCD;
import com.elementary.math.calculate.CalculateGCDEulid;
import com.elementary.math.calculate.CalculateLCMEulid;
import com.elementary.math.calculate.CalculateLogicTable;
import com.elementary.math.calculate.CalculatePartitions;
import com.elementary.math.calculate.CalculatePrimePartitions;
import com.elementary.math.calculate.CalculateStringPermutations;
import com.elementary.math.utility.PrimaryFactors;

public class Demo {

	public static void main(String[] args) {

		// CalculateLogicTable.createLogicTable(6,10);
		// CalculateStringPermutations.permutations("abcdefghi");

		// CalculateLogicTable.multiplication(1000);
		// System.out.println(CalculateLogicTable.convertToBase(23500, 16));
		// System.out.println(Integer.toHexString(23500));
		// System.out.println(CalculateLogicTable.convertToBaseN(10,12,
		// "1570"));
		// System.out.println(CalculateLogicTable.convertToDecimal(12,"AAA"));

		// CalculatePrimePartitions calcPrimePart = new
		// CalculatePrimePartitions(1000);

		CalculatePartitions calcPart = new CalculatePartitions(10);
		calcPart.cardinalPartitions();

		// System.out.println(Math.ceil(3/2.0));

	}

	public static void thePast() {

		/*
		 * List<Integer> numbers1 = new ArrayList<Integer>(); numbers1.add(8);
		 * numbers1.add(9); numbers1.add(21); CalculateLCMEulid calLcmE = new
		 * CalculateLCMEulid(numbers1); calLcmE.execute();
		 * System.out.println(calLcmE.lcmResult()); System.exit(0);
		 */

		/*
		 * Map<Integer,Integer> pFactors =
		 * PrimaryFactors.getPrimaryFactors(120);
		 * 
		 * System.out.println(pFactors.toString());
		 * 
		 * System.out.println(PrimaryFactors.prettyPrintPrimaryFactors(120,pFactors
		 * ));
		 */

		/*
		 * List<Integer> numbers = new ArrayList<Integer>(); numbers.add(3);
		 * numbers.add(20); numbers.add(17); CalculateGCD calcGcd = new
		 * CalculateGCD(numbers);
		 * 
		 * calcGcd.execute();
		 * 
		 * System.out.println(calcGcd.gcdResult());
		 */

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(6);
		numbers.add(9);
		CalculateGCDEulid calcGcd = new CalculateGCDEulid(numbers);

		calcGcd.execute();

		System.out.println(calcGcd.gcdResult());
	}
}
