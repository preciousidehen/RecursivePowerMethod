/*
 * precious idehen
 * program:  calculating the power of a number using recursive method
 */


import java.util.Scanner;

public class PowerMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		System.out.print("Enter a power: ");
		int p = input.nextInt();
		int pow = power(n, p);
		System.out.printf("the answer of %d to the power of %d is %d", n, p, pow);

	}
	public static int power(int n, int p) {
		if(p==0) {
			return 1;
		}else {
			return n * power(n, p-1);
		}
	}

}
