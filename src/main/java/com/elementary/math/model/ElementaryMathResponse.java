package com.elementary.math.model;

import java.math.BigInteger;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

public class ElementaryMathResponse {

	@JsonSerialize(include = Inclusion.NON_NULL)
	private BigInteger leastCommonMultiple;
	@JsonSerialize(include = Inclusion.NON_NULL)
	private BigInteger greatestCommonDivisor;
	@JsonSerialize(include = Inclusion.NON_NULL)
	private BigInteger leastCommonMultipleEulid;
	@JsonSerialize(include = Inclusion.NON_NULL)
	private Integer greatestCommonDivisorEulid;
	@JsonSerialize(include = Inclusion.NON_NULL)
	private String primaryFactors;
	@JsonSerialize(include = Inclusion.NON_NULL)
	private BigInteger cardinalPartition;
	@JsonSerialize(include = Inclusion.NON_NULL)
	private BigInteger cardinalPrimePartition;

	public BigInteger getLeastCommonMultiple() {
		return leastCommonMultiple;
	}

	public void setLeastCommonMultiple(BigInteger leastCommonMultiple) {
		this.leastCommonMultiple = leastCommonMultiple;
	}

	public BigInteger getGreatestCommonDivisor() {
		return greatestCommonDivisor;
	}

	public void setGreatestCommonDivisor(BigInteger greatestCommonDivisor) {
		this.greatestCommonDivisor = greatestCommonDivisor;
	}

	public BigInteger getLeastCommonMultipleEulid() {
		return leastCommonMultipleEulid;
	}

	public void setLeastCommonMultipleEulid(BigInteger leastCommonMultipleEulid) {
		this.leastCommonMultipleEulid = leastCommonMultipleEulid;
	}

	public Integer getGreatestCommonDivisorEulid() {
		return greatestCommonDivisorEulid;
	}

	public void setGreatestCommonDivisorEulid(Integer greatestCommonDivisorEulid) {
		this.greatestCommonDivisorEulid = greatestCommonDivisorEulid;
	}

	public String getPrimaryFactors() {
		return primaryFactors;
	}

	public void setPrimaryFactors(String primaryFactors) {
		this.primaryFactors = primaryFactors;
	}

	public BigInteger getCardinalPartition() {
		return cardinalPartition;
	}

	public void setCardinalPartition(BigInteger cardinalPartition) {
		this.cardinalPartition = cardinalPartition;
	}

	public BigInteger getCardinalPrimePartition() {
		return cardinalPrimePartition;
	}

	public void setCardinalPrimePartition(BigInteger cardinalPrimePartition) {
		this.cardinalPrimePartition = cardinalPrimePartition;
	}

}
