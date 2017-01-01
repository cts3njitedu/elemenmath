package com.elementary.math.demo;

import java.util.Map;

import com.elementary.math.utility.PrimaryFactors;

public class Demo {
	
	
	public static void main(String [] args){
		

		Map<Integer,Integer> pFactors = PrimaryFactors.getPrimaryFactors(120); 
		
		System.out.println(pFactors.toString());
		
		System.out.println(PrimaryFactors.convertPrimaryFactors(pFactors));
	}

}
