package demo;

import java.util.Scanner;

public class PrintWithCommandLine {

	/*public static void main(String[] args) {
		//to get the name using commmand line
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String str1=sc.next();
		
			System.out.println(str1);
	}*/
	
	public static void main(String[] args)	{
		for(int i=0;i<args.length;i++) {
		System.out.println("" +args[i]);
		}
	}
		
	}

		
	


