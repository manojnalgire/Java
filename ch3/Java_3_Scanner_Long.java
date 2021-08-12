import java.util.Scanner; // java.util package -> class Scanner
public class Java_3_Scanner_Long {// class of java 
	public static void main(String[] args) { 
		/* main() method -> java program start execution from here.*/
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter long value:");
		long a = sc.nextLong();
		System.out.println("Long  a:" + a); 

		}
	}
