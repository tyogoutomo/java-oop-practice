package multithreading;

public class ThreadTestImplement implements Runnable{
	private String name = "";

	public ThreadTestImplement(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Thread running:" + name);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
