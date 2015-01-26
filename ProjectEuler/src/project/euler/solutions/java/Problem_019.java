package project.euler.solutions.java;
/**
 * Problem 19 
 * Counting Sundays 
 * 
 * You are given the following information, but you
 * may prefer to do some research for yourself.
 * 
 * 1 Jan 1900 was a Monday. 
 * Thirty days has September, 
 * April, June and November.
 * All the rest have thirty-one, 
 * Saving February alone, 
 * Which has twenty-eight, rain or shine. 
 * And on leap years, twenty-nine. 
 * 
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 * 
 * @author Sirius
 *
 */
public class Problem_019 {

	public static void main(String[] args) {
		int[] normalYear = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		int[] leapYear = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
		//Starting Date: Jan 01, 1900
		//End Date: Dec 31, 2000
		int mondays = 1;
		int daysSinceLastMonOnFirst=0;
		for(int i = 1901; i <= 200000; i++){
			int []year;
			if((i%4==0 && i%100!=0) || (i%400==0))
				year = leapYear;
			else
				year = normalYear;			
			for(int j = 0; j < year.length; j++){
				daysSinceLastMonOnFirst+=year[j];
				if(daysSinceLastMonOnFirst % 7 == 0){
					mondays++;
					daysSinceLastMonOnFirst = 0;
				}
			}
		}
		
		System.out.println(mondays);

	}

}
