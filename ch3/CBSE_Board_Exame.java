/* 
Write a program to accept 6 subject marks from 100 and calculate
1	total marks 
2	percentage
*/
package ch3;

import java.util.Scanner;

public class CBSE_Board_Exame {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("test on Scanner object");

		float a = sc.nextFloat();
		System.out.println("Marathi = " + a);

		float b = sc.nextFloat();
		System.out.println("English = " + b);

		float c = sc.nextFloat();
		System.out.println("Mathematics = " + c);

		float d = sc.nextFloat();
		System.out.println("Science 1 = " + d);

		float e = sc.nextFloat();
		System.out.println("Science 2 = " + e);

		float f = sc.nextFloat();
		System.out.println(" geography = " + f);

		float sum =sumation(a, b, c, d, e, f);
		percentage(sum);
	}

	public static float sumation(float a, float b, float c, float d, float e, float f) {
		float sum = a + b + c + d + e + f;
		System.out.println(" Total Marks = " + sum);
		return sum;
	}

	public static void percentage(float sum) {
		float percentage = sum * 100 / 600;
		System.out.println("percentage = " + percentage);
	}

}


