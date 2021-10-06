package programs;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			return true;
		}
		
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=s.nextInt();
		
		if(isPrime(n)) {
			System.out.println(n+" is a prime number");
		}else {
			System.out.println(n+" is not a prime number");
		}
		// TODO Auto-generated method stub

	}

}
