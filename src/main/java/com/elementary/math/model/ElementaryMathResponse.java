package com.elementary.math.model;

import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

public class ElementaryMathResponse {

	@JsonSerialize(include = Inclusion.NON_NULL)
	private Integer leastCommonMultiple;
	@JsonSerialize(include = Inclusion.NON_NULL)
	private Integer greatestCommonDivisor;
	@JsonSerialize(include = Inclusion.NON_NULL)
	private Integer leastCommonMultipleEulid;
	@JsonSerialize(include = Inclusion.NON_NULL)
	private Integer greatestCommonDivisorEulid;
	@JsonSerialize(include = Inclusion.NON_NULL)
	private List<String> primaryFactors;

	public Integer getLeastCommonMultiple() {
		return leastCommonMultiple;
	}

	public void setLeastCommonMultiple(Integer leastCommonMultiple) {
		this.leastCommonMultiple = leastCommonMultiple;
	}

	public Integer getGreatestCommonDivisor() {
		return greatestCommonDivisor;
	}

	public void setGreatestCommonDivisor(Integer greatestCommonDivisor) {
		this.greatestCommonDivisor = greatestCommonDivisor;
	}

	public Integer getLeastCommonMultipleEulid() {
		return leastCommonMultipleEulid;
	}

	public void setLeastCommonMultipleEulid(Integer leastCommonMultipleEulid) {
		this.leastCommonMultipleEulid = leastCommonMultipleEulid;
	}

	public Integer getGreatestCommonDivisorEulid() {
		return greatestCommonDivisorEulid;
	}

	public void setGreatestCommonDivisorEulid(Integer greatestCommonDivisorEulid) {
		this.greatestCommonDivisorEulid = greatestCommonDivisorEulid;
	}

	public List<String> getPrimaryFactors() {
		return primaryFactors;
	}

	public void setPrimaryFactors(List<String> primaryFactors) {
		this.primaryFactors = primaryFactors;
	}

}
