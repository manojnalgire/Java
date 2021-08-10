// UseStatic.java 
class UseStatic {


	static int a = 3;
   static int b;

      static {
	   System.out.println ( "Static block initialized ");
	   b = a  *  10;
	 }
// public static void main(String[] args) {


    static void meth(int x) {
   	System.out.println("x = " + x);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
 }
   // static{
           // System.out.println ( "Static block initialized. ");
          // b = a  *  4;
            // meth (42);
        //}

 
    public static void main(String[] args) {
	  meth (42);
    }
}
	// static {
	 // ystem.out.println ( "Static block initialized ");
	 // b = a  *  4;
	  // }}
