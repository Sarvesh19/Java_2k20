package com.collection;

import java.util.Iterator;
import java.util.Optional;

public class LinkedList<E> {

	private Node<E> head;

	private Node<E> tail;

	private int size;

	private  static class Node<E> {
		E item;
		Node<E> next;
		Node<E> prev;

		Node(Node<E> prev, E element, Node<E> next) {
			this.item = element;
			this.next = next;
			this.prev = prev;
		}
	}

	public Iterator<Node<E>> iterator() {
		return new NodeIterator();
	}

	class NodeIterator implements Iterator<Node<E>> {
		private Node<E> current;

		public boolean hasNext() {
			if (current == null) {
				current = head;
				return Optional.ofNullable(current).isPresent();
			} else {
				current = current.next;
				return Optional.ofNullable(current).isPresent();
			}
		}

		public Node<E> next() {
			return current;
		}
	}

	public void addLast(E element) {

		if (head == null && tail == null) {
			head = new Node<E>(null, element, null);
			tail = head;
		} else {

			// Node temp = new Node(tail, element, null);
			tail.next = new Node<E>(tail, element, null);

			tail = tail.next;
			// tail.prev = tail;
		}
		size++;

	}

	public void addFirst(E element) {
		if (head == null && tail == null) {
			head = new Node<E>(null, element, null);
			tail = head;
		} else {

			head.prev = new Node<E>(null, element, head);

			head = head.prev;

		}
		size++;

	}

	public int size() {
		return size;
	}

	public void addAtPosition(int position, E element) {
		Node<E> node = new Node<E>(null, element, null);

		if (head == null) {
			head = new Node<E>(null, element, null);
			tail = head;
		} else {

			if (position > size) {
				throw new ArrayIndexOutOfBoundsException("positon entered is out of bound");
			} else {
				if (position == size) {
					tail.next = new Node<E>(tail, element, null);
					tail = tail.next;
				} else {
					Node<E> temp = head;
					Node<E> next = null;
					Node<E> nextTemp = null;
					Node<E> PrevTemp = null;

					for (int i = 1; i < position; i++) {
						temp = temp.next;

					}
					node.next = temp;
					temp.prev.next = node;


					node.next.prev = node;
					node.prev = temp.prev;




				}

			}

		}

		size++;
	}

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<>();
		li.addLast("sarvesh");

		li.addLast("rvesh");

		li.addLast("arvesh");

		li.addLast("Parvesh");

		li.addFirst("Ramesh");

		li.addAtPosition(2, "At 2 sarvesh");
		
		li.addFirst("K ooo");


		Iterator<Node<String>> itr = li.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next().item);
		}

		System.out.println(li.size());

		//System.out.println(li);

	}

}
