package demo;

import java.util.Scanner;

public class LeapYear {
	/*conditions:
	 * to find the year is leap year or not,firstly it should statify the condition given below
	 * 1.the year should be >=1582
	 * 2.it should be divisilble by 4,then by 400 and also by 100;
	 */
		
	    static void toCalculateLeapYear() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the year");
	    int year = sc.nextInt();
			if(year >= 1582) {
				System.out.println("valid year to check leap year ");
				if(year %4 == 0 && year %400 == 0 && year %100 ==0) {
					System.out.println("the given year is a leap year");
				}
				else {
					System.out.println("the given year is not a leap year");
				}
				
			}
			else {
				System.out.println("invlaid year");
			}
		}
	public static void main(String[] args) {
			 
			toCalculateLeapYear();
			}

}
