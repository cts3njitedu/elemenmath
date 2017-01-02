package com.elementary.math.utility;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrimaryFactors {

	public static Map<Integer, Integer> getPrimaryFactors(Integer n) {

		Map<Integer, Integer> primaryFactors = new HashMap<Integer, Integer>();
		boolean done = false;

		while (!done) {

			int nsqrt = (int) Math.ceil(Math.sqrt(n));

			for (int i = 2; i <= nsqrt; i++) {

				int nmod = n % i;

				if (nmod == 0) {

					if (primaryFactors.containsKey(i)) {

						primaryFactors.put(i, primaryFactors.get(i) + 1);
					} else {
						primaryFactors.put(i, 1);
					}

					n = n / i;
					done = true;
					break;
				}

			}
			if (done) {
				done = false;
			} else {
				if (n != 1) {
					if (primaryFactors.containsKey(n)) {

						primaryFactors.put(n, primaryFactors.get(n) + 1);
					} else {
						primaryFactors.put(n, 1);
					}
				}
				break;

			}

		}
		return primaryFactors;
	}

	public static BigInteger convertPrimaryFactors(
			Map<Integer, Integer> primFactors) {

		//double result = 1;
		BigInteger result = new BigInteger("1");
		for (Entry<Integer, Integer> entry : primFactors.entrySet()) {

			BigInteger base = new BigInteger(String.valueOf(entry.getKey()));
			result = result.multiply(base.pow(entry.getValue()));

		}
		return result;
	}
	public static String prettyPrintPrimaryFactors(int n, Map<Integer,Integer>primFacts){
		String result = "";
		if(n==1){
			result = result + "1=1";
			return result;
		}

		for(Entry<Integer,Integer> entry: primFacts.entrySet()){
			
			result = result + String.valueOf(entry.getKey()) + "^" + String.valueOf(entry.getValue()) + "*";
			
		}
		
		result = result.subSequence(0, result.lastIndexOf('*')) + "";
		result = result.trim();
		result = result + "="+n;
		return result;
	}
}
