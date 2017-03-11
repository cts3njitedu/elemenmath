package com.elementary.math.calculate;

import java.util.HashMap;
import java.util.Map;

public class CalculateLogicTable {

	public static Map<Integer, String> LETTERS;

	public static Map<String, Integer> NUMBERS;

	static {

		LETTERS = new HashMap<Integer, String>(6);

		LETTERS.put(10, "A");
		LETTERS.put(11, "B");
		LETTERS.put(12, "C");
		LETTERS.put(13, "D");
		LETTERS.put(14, "E");
		LETTERS.put(15, "F");
		LETTERS.put(16, "G");
		LETTERS.put(17, "H");
		LETTERS.put(18, "I");
		LETTERS.put(19, "J");
		LETTERS.put(20, "K");
		LETTERS.put(21, "L");
		LETTERS.put(22, "M");
		LETTERS.put(23, "N");
		LETTERS.put(24, "O");
		LETTERS.put(25, "P");
		LETTERS.put(26, "Q");
		LETTERS.put(27, "R");
		LETTERS.put(28, "S");
		LETTERS.put(29, "T");
		LETTERS.put(30, "U");
		LETTERS.put(31, "V");
		LETTERS.put(32, "W");
		LETTERS.put(33, "X");
		LETTERS.put(34, "Y");
		LETTERS.put(35, "Z");

		NUMBERS = new HashMap<String, Integer>();

		NUMBERS.put("A", 10);
		NUMBERS.put("B", 11);
		NUMBERS.put("C", 12);
		NUMBERS.put("D", 13);
		NUMBERS.put("E", 14);
		NUMBERS.put("F", 15);
		NUMBERS.put("G", 16);
		NUMBERS.put("H", 17);
		NUMBERS.put("I", 18);
		NUMBERS.put("J", 19);
		NUMBERS.put("K", 20);
		NUMBERS.put("L", 21);
		NUMBERS.put("M", 22);
		NUMBERS.put("N", 23);
		NUMBERS.put("O", 24);
		NUMBERS.put("P", 25);
		NUMBERS.put("Q", 26);
		NUMBERS.put("R", 27);
		NUMBERS.put("S", 28);
		NUMBERS.put("T", 29);
		NUMBERS.put("U", 30);
		NUMBERS.put("V", 31);
		NUMBERS.put("W", 32);
		NUMBERS.put("X", 33);
		NUMBERS.put("Y", 34);
		NUMBERS.put("Z", 35);

	}

	public static void createLogicTable(int base, int exp) {

		long maxValue = (long) Math.pow(base, exp);

		int[] record = new int[exp];

		int length = exp;

		

		for (long counter = 1; counter <= maxValue + 1; counter++) {

			for (int i = 0; i < length; i++) {

				long pow = (long) Math.pow(base, length - (i + 1));

				if (counter == 1) {

					record[i] = 0;
				} else {

					int z = record[i];

					if (z <= 9) {
						System.out.print(z);
					}

					else {
						System.out.print(LETTERS.get(z));
					}

					if ((counter - 1) % pow == 0) {

						z = z + 1;
						if (z == base) {

							record[i] = 0;
						} else {
							record[i] = z;
						}
					}
				}
			}

			if (counter != 1) {
				System.out.println();
			}

		}
		
		System.out.println("Base=" + base + ", Exponent=" + exp);
		System.out.println("Number of Rows " + maxValue);
		System.out.println(LETTERS);

	}

	public static String convertToBaseN(int baseFrom, int baseTo, String n){
		
		
		return (baseTo==10) ? ""+convertToDecimal(baseFrom, n, 1):convertToBase(convertToDecimal(baseFrom,n,1),baseTo);
		
	}
	public static String convertToBase(int d, int n) {
		int m = d%n;
		String r=(m>9)?LETTERS.get(m):m + "";
		if (d / n == 0)

			return r +"";

		else
			return convertToBase(d / n, n) + r + "";

	}

	public static int convertToDecimal(int b, String n) {

		return convertToDecimal(b,n,1);

	}
	public static int convertToDecimal(int b, String n, int c) {

		char m = n.charAt(c - 1);
		int x = (Character.isLetter(m)) ? NUMBERS.get(m + ""):Integer.parseInt(m + "");
	
		int l = n.length();

		if (c == n.length()) {

			return (x == 0) ? 0 : x;
		}

		else {

			return (x == 0) ? convertToDecimal(b, n, c + 1) : (int) (x
					* Math.pow(b, l - c) + convertToDecimal(b, n, c + 1));

		}

	}
	
	
	public static void multiplication(int n){
	
		
		for(int i=1; i<=n; i++){
			
			for(int j= i; j<=i*n; j=j+i){
				 System.out.print(j+ ",");
			}
			
			System.out.println();
		}
	}

}
