import java.util.Scanner; // java.util package -> class Scanner
public class Java_3_Scanner_Boolean {// class of java 
	public static void main(String[] args) { 
		/* main() method -> java program start execution from here.*/
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter Boolean  value:");
		boolean  a = sc.nextBoolean();
		System.out.println("Boolean  a:" + a); 

		}
	}
/*
Output:
D:\java_test\ch3>javac Java_3_Scanner_Boolean.java
D:\java_test\ch3>java Java_3_Scanner_Boolean
Please enter Boolean  value:
false
Boolean  a:false

*/