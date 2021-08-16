// ch_14_Method.java
public class ch_14_Method {
	public static void main(String[] args) {
		 // String name = new String();
		String name = "Harry";
		int length = name.length();
		String lstring = name.toLowerCase();

		System.out.println(lstring);
		 String ustring = name.toUpperCase();
		 String nonTrimmedString = "nonTrimmedString";

		 System.out.println(nonTrimmedString);
		 System.out.println(name.substring(3));
		    System.out.println(length);
		   
			System.out.println(name.startsWith("H"));
			 //	System.out.println(length);

	}
}
