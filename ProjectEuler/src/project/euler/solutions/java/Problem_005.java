package project.euler.solutions.java;
import java.util.Arrays;

/**
 * Problem 5
 * Smallest multiple 
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 * 
 * @author Sirius
 *
 */
public class Problem_005 {

	public static void main(String[] args) {
		int n = 20;
		int[] primes = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
				41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103,
				107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167,
				173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233,
				239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307,
				311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379,
				383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449,
				457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541 };
		int [] primesForN = getPrimes(n, primes);
		int sped = smallestPositiveEvenDivisible(n, primesForN);
		System.out.println(sped);
		
	}
	
	public static int smallestPositiveEvenDivisible(int n, int[] primes){
		int sped = primes[0];
		int factors[]= new int[n+1];
		Arrays.fill(factors, 0);
		//factorize
		for(int i = 2; i < n; i++){
			for(int j = 1; j < primes.length; j++){
				int count = 0;
				int k = i;
				while(k % primes[j] == 0){
					k = k/primes[j];
					count++;
				}
				if(count > factors[j])
					factors[j]=count;					
				
				
			}
		}
		for(int i = 1; i < primes.length; i++){
			sped *= Math.pow(primes[i], factors[i]);   
		}
		return sped;
	}
	
	public static int[] getPrimes(int n, int[] primes){			
		//assuming n is positive number
		int count = 0;
		for(int i = 0; i < primes.length; i++){
			if(primes[i] < n){
				count++;
			}
		}
		
		int [] primesForN = Arrays.copyOfRange(primes, 0, count);
		
		return primesForN;
	}

}
