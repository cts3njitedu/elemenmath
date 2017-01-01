package com.elementary.math.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.elementary.math.ElementaryMathInterface;
import com.elementary.math.calculate.CalculateGCD;
import com.elementary.math.calculate.CalculateGCDEulid;
import com.elementary.math.calculate.CalculateLCM;
import com.elementary.math.calculate.CalculateLCMEulid;
import com.elementary.math.calculate.CalculatePrimaryFactors;
import com.elementary.math.model.ElementaryMathResponse;
import com.elementary.math.model.Numbers;

@Path("")
public class ElementaryMath implements ElementaryMathInterface {

	@Override
	@POST
	@Path("/lcm")
	@Consumes("application/json")
	@Produces("application/json")
	public Response leastCommonMultiple(Numbers numbers) {
		// TODO Auto-generated method stub
		CalculateLCM calcLcm = new CalculateLCM(numbers.getNumbers());

		calcLcm.execute();

		ElementaryMathResponse response = new ElementaryMathResponse();

		response.setLeastCommonMultiple(calcLcm.lcmResult());

		return Response.status(200).entity(response).build();
	}

	@Override
	@POST
	@Path("/gcd")
	@Consumes("application/json")
	@Produces("application/json")
	public Response greatestCommonDivisor(Numbers numbers) {
		// TODO Auto-generated method stub
		CalculateGCD calcGcd = new CalculateGCD(numbers.getNumbers());

		calcGcd.execute();

		ElementaryMathResponse response = new ElementaryMathResponse();

		response.setGreatestCommonDivisor(calcGcd.gcdResult());

		return Response.status(200).entity(response).build();
	}

	@Override
	@POST
	@Path("/lcm/eulid")
	@Consumes("application/json")
	@Produces("application/json")
	public Response leastCommonMultipleEulid(Numbers numbers) {
		// TODO Auto-generated method stub
		CalculateLCMEulid calcGcd = new CalculateLCMEulid(numbers.getNumbers());

		calcGcd.execute();

		ElementaryMathResponse response = new ElementaryMathResponse();

		response.setLeastCommonMultipleEulid(calcGcd.lcmResult());

		return Response.status(200).entity(response).build();
	}

	@Override
	@POST
	@Path("/gcd/eulid")
	@Consumes("application/json")
	@Produces("application/json")
	public Response greatestCommonDivisorEulid(Numbers numbers) {
		// TODO Auto-generated method stub
		CalculateGCDEulid calcGcd = new CalculateGCDEulid(numbers.getNumbers());

		calcGcd.execute();

		ElementaryMathResponse response = new ElementaryMathResponse();

		response.setGreatestCommonDivisorEulid(calcGcd.gcdResult());

		return Response.status(200).entity(response).build();
	}

	@Override
	@POST
	@Path("/primfact")
	@Consumes("application/json")
	@Produces("application/json")
	public Response primaryFactors(Numbers numbers) {

		CalculatePrimaryFactors calc = new CalculatePrimaryFactors(
				numbers.getNumbers());

		calc.execute();

		ElementaryMathResponse response = new ElementaryMathResponse();

		response.setPrimaryFactors(calc.getPrimaryFactors());

		return Response.status(200).entity(response).build();

	}
}
