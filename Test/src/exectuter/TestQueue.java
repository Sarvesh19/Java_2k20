package exectuter;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class TestQueue {

	public static void main(String[] args) {

		// ArrayDeque<E>
		PriorityQueue p = new PriorityQueue<>();

		p.add("sarvehs");
		p.add("sarvehs");

		p.add("arvehs");
		p.add("rvehs");
		p.add("vehs");
		p.add("ehs");
		System.out.println(p);
		
		System.out.println("efef : "+p.poll());

		System.out.println("efef : "+p.poll());
		System.out.println("efef : "+p.poll());
		
		System.out.println("efef : "+p.peek());


		Iterator itr = p.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
