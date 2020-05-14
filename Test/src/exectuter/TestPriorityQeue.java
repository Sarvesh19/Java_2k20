package exectuter;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class TestPriorityQeue {
	public static void main(String[] args) throws InterruptedException {
		ArrayBlockingQueue<Integer> blo = new ArrayBlockingQueue<Integer>(5);

		LinkedBlockingDeque<String> li = new LinkedBlockingDeque<>();

		li.offer("sarvesh");
		li.offer("arvesh");
		li.offer("rvesh");
		li.offer("vesh");
		li.put("sarvesj");
		li.put("sarvesj");
		li.put("rvesj");

//		blo.offer(3);
//		blo.offer(3);
//		
//		blo.offer(34);
//		
//		blo.offer(3);
//		blo.offer(35);
//		blo.offer(36);

		blo.put(23);
		System.out.println(blo.take());

		blo.put(243);

		blo.put(253);
		blo.put(223);
		blo.put(23);
		blo.put(23);
		blo.take();


		blo.take();
		blo.put(23);

		System.out.println(blo);

	}
}
