package com.elementary.math.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.elementary.math.calculate.CalculateGCD;
import com.elementary.math.calculate.CalculateLCMEulid;
import com.elementary.math.utility.PrimaryFactors;

public class Demo {
	
	
	public static void main(String [] args){
		

		/*List<Integer> numbers1 = new ArrayList<Integer>();
		numbers1.add(8);
		numbers1.add(9);
		numbers1.add(21);
		CalculateLCMEulid calLcmE = new CalculateLCMEulid(numbers1);
		calLcmE.execute();
		System.out.println(calLcmE.lcmResult());*/
	
		Map<Integer,Integer> pFactors = PrimaryFactors.getPrimaryFactors(120); 
		
		System.out.println(pFactors.toString());
		
		System.out.println(PrimaryFactors.prettyPrintPrimaryFactors(120,pFactors));

		System.exit(0);
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(9);
		numbers.add(12);
		CalculateGCD calcGcd = new CalculateGCD(numbers);
		
		calcGcd.execute();
		
		System.out.println(calcGcd.gcdResult());
		
		
	}

}
