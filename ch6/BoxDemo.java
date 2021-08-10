// BoxDemo.java
class Box { // base class or parent class 
	double width;
	double height;
	double depth;
}
class BoxDemo{
	 public static void main (String[] args) {
	 	// create a Box object called myBox.
	 	Box mybox = new Box ();
	 	double vol; 
	 	// assign values myBox's instance variables.
	 	mybox.width = 10;
	 	mybox.height =20;
	 	mybox.depth =15;

	 	//compute volume of box 
	 	vol = mybox.width * mybox.height * mybox.depth;
	 	System.out.println(" Volume is " + vol );


	 }
		
	}
