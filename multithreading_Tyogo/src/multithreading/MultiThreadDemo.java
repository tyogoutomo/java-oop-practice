package multithreading;

public class MultiThreadDemo extends Thread{
	private Thread t;
	private String name;
	
	public MultiThreadDemo(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void start() {
		System.out.println("Starting " + name);
		if(t == null) { //Check if there is previously made thread
			t = new Thread(this,name);
			t.start();
		}
	}
	public void run() {
		System.out.println("Running " + name);
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Thread: " + name + " proccessing "+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("/Thread: " + name + " Terminating");
	}

}
