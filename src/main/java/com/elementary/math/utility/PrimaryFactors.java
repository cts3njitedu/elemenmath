package com.elementary.math.utility;

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
				if (primaryFactors.containsKey(n)) {

					primaryFactors.put(n, primaryFactors.get(n) + 1);
				} else {
					primaryFactors.put(n, 1);
				}
				break;

			}

		}
		return primaryFactors;
	}

	public static Integer convertPrimaryFactors(Map<Integer,Integer> primFactors){
		
		double result=1;
		for(Entry<Integer, Integer> entry: primFactors.entrySet()){
			
			result = result * Math.pow(entry.getKey(), entry.getValue());
			
		}
		return (int) result;
	}
}
