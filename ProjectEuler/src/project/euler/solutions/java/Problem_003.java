package project.euler.solutions.java;
import java.util.Arrays;

/**
 * Problem 3
 * Largest prime factor 
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author Sirius
 *
 */
public class Problem_003 {
	
	public static void main(String[] args) {
			
		args = new String[]{"600851475143"};
		
		long number = Long.parseLong(args[0]);
		
		if(Math.sqrt(number) <= Integer.MAX_VALUE){
			int sqrtNumber = (int) Math.floor(Math.sqrt(number));
			
			//Sieve of Eratosthenes
			boolean[] array = new boolean[sqrtNumber+1];
			Arrays.fill(array, true);
			
			for(int i = 2; i < sqrtNumber+1; i++){
				for(int j = i+i; j < sqrtNumber+1; j+=i){
					array[j] = false;
				}
			}
			for(int i = sqrtNumber ; i > 0 ; i--){
				if(array[i] == true){
					if(number % i == 0){
						System.out.println(i);
					}
				}
			}
		}
	
	}
}
