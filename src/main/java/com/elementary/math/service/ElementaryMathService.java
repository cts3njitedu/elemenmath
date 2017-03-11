package com.elementary.math.service;

import com.elementary.math.calculate.CalculateGCD;
import com.elementary.math.calculate.CalculateGCDEulid;
import com.elementary.math.calculate.CalculateLCM;
import com.elementary.math.calculate.CalculateLCMEulid;
import com.elementary.math.calculate.CalculatePartitions;
import com.elementary.math.calculate.CalculatePrimePartitions;
import com.elementary.math.model.ElementaryMathResponse;
import com.elementary.math.model.Numbers;
import com.elementary.math.utility.PrimaryFactors;

public class ElementaryMathService {

	public static ElementaryMathResponse leastCommonMultiple(Numbers numbers) {
		// TODO Auto-generated method stub
		CalculateLCM calcLcm = new CalculateLCM(numbers.getNumbers());

		calcLcm.execute();

		ElementaryMathResponse response = new ElementaryMathResponse();

		response.setLeastCommonMultiple(calcLcm.lcmResult());

		return response;
	}

	public static ElementaryMathResponse greatestCommonDivisor(Numbers numbers) {
		// TODO Auto-generated method stub
		CalculateGCD calcGcd = new CalculateGCD(numbers.getNumbers());

		calcGcd.execute();

		ElementaryMathResponse response = new ElementaryMathResponse();

		response.setGreatestCommonDivisor(calcGcd.gcdResult());

		return response;
	}

	public static ElementaryMathResponse leastCommonMultipleEulid(
			Numbers numbers) {
		// TODO Auto-generated method stub
		CalculateLCMEulid calcGcd = new CalculateLCMEulid(numbers.getNumbers());

		calcGcd.execute();

		ElementaryMathResponse response = new ElementaryMathResponse();

		response.setLeastCommonMultipleEulid(calcGcd.lcmResult());

		return response;
	}

	public static ElementaryMathResponse greatestCommonDivisorEulid(
			Numbers numbers) {
		// TODO Auto-generated method stub
		CalculateGCDEulid calcGcd = new CalculateGCDEulid(numbers.getNumbers());

		calcGcd.execute();

		ElementaryMathResponse response = new ElementaryMathResponse();

		response.setGreatestCommonDivisorEulid(calcGcd.gcdResult());

		return response;
	}

	public static ElementaryMathResponse primaryFactors(Numbers numbers) {

		Integer n = numbers.getNumber();
		ElementaryMathResponse response = new ElementaryMathResponse();

		response.setPrimaryFactors(PrimaryFactors.prettyPrintPrimaryFactors(n,
				PrimaryFactors.primFactors(n)));

		return response;

	}

	public static ElementaryMathResponse cardinalPartitions(Numbers numbers) {
		// TODO Auto-generated method stub
		CalculatePartitions calc = new CalculatePartitions(numbers.getNumber());

		ElementaryMathResponse response = new ElementaryMathResponse();

		response.setCardinalPartition(calc.cardinalPartitions());
		return response;
	}

	public static ElementaryMathResponse cardinalPrimePartitions(Numbers numbers) {

		CalculatePrimePartitions calc = new CalculatePrimePartitions(
				numbers.getNumber());
		ElementaryMathResponse response = new ElementaryMathResponse();

		response.setCardinalPrimePartition(calc.cardinalPrimePartition());
		return response;

	}
}
