package project.euler.solutions.java;
/**
 * Problem 4
 * Largest palindrome product 
 * 
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author Sirius
 *
 */

public class Problem_004 {

	public static void main(String[] args) {
		int limit = 999;
		Integer potentialPalindrome = 0;
		Integer max = 0;
		for(int i = limit; i > 99; i--){
			for(int j = limit; j > 99;j--){
				potentialPalindrome = i*j;
				if(checkPalindrome(potentialPalindrome) && potentialPalindrome > max){
					max = potentialPalindrome;
					System.out.println(i + " x " + j + " = " + potentialPalindrome);
				}				 
			}
		}
	}
	
	public static boolean checkPalindrome(Integer potentialPalindrome){
		char[] p = potentialPalindrome.toString().toCharArray();
		int matches = 0;
		for(int i = 0; i < p.length/2;i++){
			if(p[i] == p[p.length-1-i]){
				matches++;
			}
		}
		if(matches == p.length/2)		
			return true;
		return false;
	}

}
