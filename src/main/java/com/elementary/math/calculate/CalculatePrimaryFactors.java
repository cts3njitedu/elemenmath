package com.elementary.math.calculate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.elementary.math.utility.PrimaryFactors;
import com.elementary.math.utility.RemoveDuplicates;

public class CalculatePrimaryFactors {

	private List<Integer> numbers;

	private List<String> primaryFactors;

	public CalculatePrimaryFactors(List<Integer> numbers) {
		this.numbers = RemoveDuplicates.removeDuplicates(numbers);
		this.primaryFactors = new ArrayList<String>();
	}

	public void execute(){
		
		for(Integer n : numbers){
			
			Map<Integer,Integer> pFacts = PrimaryFactors.getPrimaryFactors(n);
			primaryFactors.add(PrimaryFactors.prettyPrintPrimaryFactors(n,pFacts));
		}
	}
	
	public List<String> getPrimaryFactors() {
		
		return primaryFactors;
	}

	
	

}
