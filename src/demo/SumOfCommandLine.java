package demo;

import java.util.Scanner;

public class SumOfCommandLine {
		static int count = 0;
		static int sum = 0;
		public static void main(String[] args) {
			for(int i =0;i<args.length;i++) {
				System.out.println("Enter the number");
				System.out.println(args[i]);
				try {
					int n = Integer.parseInt(args[i]);
					sum = sum + n;
				}
				catch(NumberFormatException e) {
					count ++;
					System.out.println("");
				}
			}
			System.out.println("the sum is"+ "" +sum);
			System.out.println("invalid count is :"+count);
  	

	}

}
