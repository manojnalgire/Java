import java.util.Scanner; // java.util package -> class Scanner
public class Java_3_Scanner_Char {// class of java 
	public static void main(String[] args) { 
		/* main() method -> java program start execution from here.*/
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter char value:");
		char a = sc.next().charAt(0);
		System.out.println("Char a:" + a); 

		}
	}
