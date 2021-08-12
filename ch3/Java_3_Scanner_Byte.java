import java.util.Scanner; // java.util package -> class Scanner
public class Java_3_Scanner_Byte {// class of java 
	public static void main(String[] args) { 
		/* main() method -> java program start execution from here.*/
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter byte value:");
		byte a = sc.nextByte();
		System.out.println("Byte a:" + a); 

		}
	}
