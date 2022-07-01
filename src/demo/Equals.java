package demo;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1 = sc.next();
		System.out.println("Enter the second string");
		String str2 = sc.next();
		//check for equals
		if(str1.equals(str2)) {
			System.out.println("the two strings are equals");
		}
			else{
			System.out.println("two strings are not equal");
			}
		
		}
	}


