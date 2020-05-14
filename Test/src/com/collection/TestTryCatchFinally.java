package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TestTryCatchFinally {

	static int getInt(int i) {

		try {
			return (i + 3) / 0;

		} catch (Exception e) {
			return i + 4;
		} finally {
			return i + 7;

		}

	}
	
	

	public static void main(String[] args) {
		
		LinkedList l  = new LinkedList<>();
		//l
		
		
		System.out.println(getInt(3));

		Queue q = new PriorityQueue(4);
//Queue q2= new LinkedList<>();		//BlockingQueue<E>
		//ArrayDeque<E>
//ConcurrentLinkedQueue<E>
//ArrayDeque<E>
//Block
		//Deque<E>

		//LinkedList<E>

		q.add("sarves");
		q.add("arves");
		q.add("sarves");
		q.add("sarves");
		q.add("sarves");
		q.add("sarves");
		System.out.println(q.element());
		
		
		

		
		System.out.println(q);

		//q.offer(null);

	}
}
