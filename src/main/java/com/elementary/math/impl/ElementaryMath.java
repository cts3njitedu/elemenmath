package com.elementary.math.impl;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.elementary.math.ElementaryMathInterface;
import com.elementary.math.model.Numbers;
import com.elementary.math.service.ElementaryMathService;

@Path("")
public class ElementaryMath implements ElementaryMathInterface {

	@Override
	public Response leastCommonMultiple(Numbers numbers) {


		return Response.status(200).entity(ElementaryMathService.leastCommonMultiple(numbers)).build();
	}

	@Override
	public Response greatestCommonDivisor(Numbers numbers) {
		// TODO Auto-generated method stub
	
		return Response.status(200).entity(ElementaryMathService.greatestCommonDivisor(numbers)).build();
	}

	@Override
	public Response leastCommonMultipleEulid(Numbers numbers) {
		// TODO Auto-generated method stub
	

		return Response.status(200).entity(ElementaryMathService.leastCommonMultipleEulid(numbers)).build();
	}

	@Override
	public Response greatestCommonDivisorEulid(Numbers numbers) {
		// TODO Auto-generated method stub
	

		return Response.status(200).entity(ElementaryMathService.greatestCommonDivisorEulid(numbers)).build();
	}

	@Override
	public Response primaryFactors(Numbers numbers) {

	

		return Response.status(200).entity(ElementaryMathService.primaryFactors(numbers)).build();

	}

	@Override
	public Response cardinalPartitions(Numbers numbers) {
		// TODO Auto-generated method stub
		
		return Response.status(200).entity(ElementaryMathService.cardinalPartitions(numbers)).build();
	}

	@Override
	public Response cardinalPrimePartitions(Numbers numbers) {
		// TODO Auto-generated method stub
		return Response.status(200).entity(ElementaryMathService.cardinalPrimePartitions(numbers)).build();
	}
}
