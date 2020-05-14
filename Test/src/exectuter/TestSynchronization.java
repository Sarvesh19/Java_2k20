package exectuter;

class EvenOrOdd implements Runnable {
	private int max;
	private Printer print;
	private boolean isEvenNumber;

	public EvenOrOdd(Printer print, int max, boolean isEvenNumber) {
		super();
		this.max = max;
		this.print = print;
		this.isEvenNumber = isEvenNumber;
	}

	@Override
	public void run() {
		int number = isEvenNumber ? 2 : 1;
		while (number <= max) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (isEvenNumber) {
				print.printEven(number);
			} else {
				print.printOdd(number);
			}
			number += 2;
		}
	}

}

class Printer {
	private volatile boolean isOdd;

	synchronized void printEven(int number) {
		if (!isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName() + ":" + number);
		isOdd = false;
		notify();
	}

	synchronized void printOdd(int number) {
		if (isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName() + ":" + number);
		isOdd = true;
		notify();
	}
}

public class TestSynchronization {
	public static void main(String[] args) throws InterruptedException {
		Printer print = new Printer();
		Thread t1 = new Thread(new EvenOrOdd(print, 10, false), "Odd");
		Thread t2 = new Thread(new EvenOrOdd(print, 10, true), "Even");
		t1.start();
		// t1.join();
		t2.start();
		// t2.join();

	}
}
