package com.elementary.math.calculate;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.elementary.math.utility.PrimaryFactors;

public class CalculatePrimePartitions {

	private BigInteger[] sopfTable;
	private BigInteger[] partitionTable;
	private int n;
	private static BigInteger ONE = new BigInteger("1");
	private static BigInteger ZERO = new BigInteger("0");

	private Map<Integer, Boolean> primaryNumbers;

	public CalculatePrimePartitions(int n) {

		this.sopfTable = new BigInteger[n + 1];
		this.partitionTable = new BigInteger[n + 1];
		this.primaryNumbers = new HashMap<Integer,Boolean>();
		this.n = n;

	}

	public BigInteger cardinalPrimePartition() {

		BigInteger answer = null;
		for (int i = 1; i <= n; i++) {

			if (i == n) {
				answer = primePartitions(i);
			} else {
				primePartitions(i);
			}
		}
		return answer;
	}

	public BigInteger primePartitions(int n) {

		if (n == 0)
			return ONE;
		else if (n == 1)
			return ZERO;
		else {

			BigInteger sum = ZERO;
			for (int j = 1; j < n; j++) {

				BigInteger sopf = sopfTable[j];
				BigInteger primePart = partitionTable[n - j];

				if (sopf == null) {
					sopf = sopf(j);
					sopfTable[j] = sopf;

				}
				if (primePart == null) {
					primePart = primePartitions(n - j);
					partitionTable[n - j] = primePart;
				}
				sum = sum.add(sopf.multiply(primePart));
			}

			BigInteger sopfN = sopfTable[n];
			if (sopfN == null) {
				sopfN = sopf(n);
				sopfTable[n] = sopfN;
			}
			return (sopfN.add(sum)).divide(new BigInteger(n + ""));

		}
	}

	public BigInteger sopf(int n) {
		Map<Integer, Integer> primFacts = PrimaryFactors.primFactors(n);
		long sum = 0;
		for (Entry<Integer, Integer> entry : primFacts.entrySet()) {

			sum = sum + entry.getKey();
		}

		return new BigInteger(sum + "");
	}

	public void printPrimePartitions() {

		
		printPrimePartitions("", n, n, 0, n);
	}

	public void printPrimePartitions(String part, int prevNum, int left,
			int subtotal, int total) {

		if (left == 2) {

			System.out.println(part + "+" + left);
			return;
		} 
		else if(left==1){
			return;
		}
		else {

			for (int i = left; i >= 2; i--) {

				if(i>prevNum){
					continue;
				}
				Boolean primary = primaryNumbers.get(i);
				boolean isPrimary = false;
				
				if(primary==null){
				 isPrimary = PrimaryFactors.isPrimaryNumber(i);
				 primaryNumbers.put(i, isPrimary);
				
				}
				else{
					
					isPrimary = primary;
				}
				
				if (i <= prevNum && isPrimary) {
					int sum = subtotal + i;
					if (sum == total) {

						String subPart="";
						if(part.length()==0){
							subPart = part + "" + i;
						}
						else{
							subPart = part + "+"+i;
						}
						System.out.println(subPart);
					}

					else if(sum<total){

						String subPart="";
						if(part.length()==0){
							subPart = part + "" + i;
						}
						else{
							subPart = part + "+"+i;
						}
					
						printPrimePartitions(subPart, i, total - sum, sum,
								total);
					}
				}
			}
		}
	}
}
