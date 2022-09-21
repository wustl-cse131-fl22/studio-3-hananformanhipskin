package studio3;

import java.util.Scanner;

public class Studio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What number do you want to use as your ceiling?");
		int ceiling = in.nextInt();
		
		int[]isPrime  = new int[ceiling];
	
		for (int i = 2; i<ceiling; i++)
		{
			int copyIsPrime[]= isPrime;
			copyIsPrime = isPrime; 
		}
	
		System.out.println(isPrime);
	}

}

