package com.elementary.math;

import javax.ws.rs.core.Response;

import com.elementary.math.model.Numbers;

public interface ElementaryMathInterface {

	public Response leastCommonMultiple(Numbers numbers);

	public Response greatestCommonDivisor(Numbers numbers);

	public Response leastCommonMultipleEulid(Numbers numbers);

	public Response greatestCommonDivisorEulid(Numbers numbers);
	

	
	public Response primaryFactors(Numbers numbers);
}
