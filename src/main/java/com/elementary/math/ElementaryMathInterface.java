package com.elementary.math;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.elementary.math.model.Numbers;

public interface ElementaryMathInterface {

	@POST
	@Path("/lcm")
	@Consumes("application/json")
	@Produces("application/json")
	public Response leastCommonMultiple(Numbers numbers);

	@POST
	@Path("/gcd")
	@Consumes("application/json")
	@Produces("application/json")
	public Response greatestCommonDivisor(Numbers numbers);

	@POST
	@Path("/lcm/eulid")
	@Consumes("application/json")
	@Produces("application/json")
	public Response leastCommonMultipleEulid(Numbers numbers);

	@POST
	@Path("/gcd/eulid")
	@Consumes("application/json")
	@Produces("application/json")
	public Response greatestCommonDivisorEulid(Numbers numbers);

	@POST
	@Path("/primfact")
	@Consumes("application/json")
	@Produces("application/json")
	public Response primaryFactors(Numbers numbers);

	@POST
	@Path("/partitions")
	@Consumes("application/json")
	@Produces("application/json")
	public Response cardinalPartitions(Numbers numbers);
	
	@POST
	@Path("/partitions/prime")
	@Consumes("application/json")
	@Produces("application/json")
	public Response cardinalPrimePartitions(Numbers numbers);
}
