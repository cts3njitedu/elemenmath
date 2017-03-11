package com.elementary.math.calculate;

public class CalculateStringPermutations {
	
	
	public static void permutations(String x){
		
		permutations("",x);
		
		
	}
	
	
	public static void permutations(String p, String x){
		
		
		if(x.length()==1){
			
			System.out.println(x.charAt(0)+p);
			return;
		}
		else{
			
			for(int i =0; i<x.length();i++){
				
				permutations(x.charAt(i)+p, x.substring(0,i) +x.substring(i+1, x.length()));
			}
		}
		
	}

}
