class NewThread implements Readable{
	String name; // name of thread
	Thread t;

	NewThread (String threadname) {
		name = threadname;
		t + new Thread ( this, name);
		System.out .println("New thread: " + t);

	}
	// This is the entry point for thread.
	public void run () {

	}
}


class DemoJoin {
	public static void main(String[] args) {
		
	}
}