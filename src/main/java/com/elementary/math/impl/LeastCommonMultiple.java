package com.elementary.math.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.elementary.math.LeastCommonMultipleInterface;
import com.elementary.math.calculate.CalculateLCM;
import com.elementary.math.model.LCMResponse;
import com.elementary.math.model.Numbers;

@Path("/lcm")
public class LeastCommonMultiple implements LeastCommonMultipleInterface {

	@Override
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response leastCommonMultiple(Numbers numbers) {
		// TODO Auto-generated method stub
		CalculateLCM calcLcm = new CalculateLCM(numbers.getNumbers());
		
		calcLcm.execute();
		
		LCMResponse lcmResponse = new LCMResponse();
		
		lcmResponse.setLcm(calcLcm.lcmResult());
		
		return Response.status(200).entity(lcmResponse).build();
	}

}
