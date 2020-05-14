package com.collection;

public class TestWhile {
	public static void main(String[] args) throws InterruptedException {
		int count = 0;
		while (count != 100) {
			count++;
			Thread.sleep(1000);
			System.out.println("count_" + count);
		}
	}
}
