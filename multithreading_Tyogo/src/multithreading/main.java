package multithreading;

public class main {
	public static void main(String[] args) {
		// 5 states on threading
		// NEW -> create thread -> create obj from Class Thread 
		// RUNNABLE -> thread ready for running -> call start()
		// RUNNING -> thread already running -> resume(), wait(), notify(), etc
		// NON-RUNNABLE(blocked) -> active thread being non activated -> sleep()
		// TERMINATED(dead) -> stop thread -> exit process 
		
//		ThreadTestExtends t1 = new ThreadTestExtends(); //NEW
//		t1.start(); //RUNNABLE
//		t1.run();
/*
		System.out.println("---using extends");
		for(int i=0; i<5; i++) {
			ThreadTestExtends t2 = new ThreadTestExtends(); //NEW
			t2.setName("T" + i);
			t2.start(); //RUNNABLE
		}
*/
/*
		System.out.println("---using implement");
		for(int i=0; i<5; i++) {
			ThreadTestImplement im = new ThreadTestImplement(String.valueOf(" T" + i)); //NEW
			Thread t3 = new Thread(im);
			t3.start();
		}
*/
		MultiThreadDemo mt1 = new MultiThreadDemo("Thread-1");
		mt1.start();
		
		MultiThreadDemo mt2 = new MultiThreadDemo("Thread-2");
		mt2.start();
		
		
	}

}
