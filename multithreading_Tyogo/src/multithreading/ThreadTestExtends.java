package multithreading;

public class ThreadTestExtends extends Thread{
	@Override
	public void run() {
//		System.out.println("Thread running" + getName());
		try {
			System.out.println("Thread running: " + getName());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
