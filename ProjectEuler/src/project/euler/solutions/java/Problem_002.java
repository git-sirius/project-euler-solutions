package project.euler.solutions.java;
/**
 * Project Euler #2
 * @author Sirius
 *
 */
public class Problem_002 {

	public static void main(String[] args) throws InterruptedException {
		Runnable prob = new Runnable() {
			
			@Override
			public void run() {
			
				long [] fib = new long [1000];
				fib [0] = 1;
				fib [1] = 1;
				for (int i = 2; fib[i-1] < 1000000L; i++){
				  fib [i] = fib [i - 1] + fib [i - 2];
				  System.out.println(fib[i]);
				}
			}
		};
		prob.run();

	}

}
