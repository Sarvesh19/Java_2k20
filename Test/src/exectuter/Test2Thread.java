package exectuter;

class Counter implements Runnable {
	int i = 0;

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Num_" + i++ + Thread.currentThread());

		}
		// System.out.println("NumPre_" + ++i);

	}

}

public class Test2Thread {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Counter());
		Thread t2 = new Thread(new Counter());

		t1.start();
		//t1.join();
		t2.start();
		//t2.join();

	}

}
