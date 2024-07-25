package advanced;

import java.util.Scanner;

public class FindingLargest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		
		if(a>b) {
			System.out.println("A is the largest " + a);
		} else {
			System.out.println("B is the largest " + b);
		}

	}

}
