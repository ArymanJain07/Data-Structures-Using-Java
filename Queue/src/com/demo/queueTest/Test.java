package com.demo.queueTest;

import com.demo.LinkedList.Queue;

public class Test {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		queue.enqueue(70);
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.display();
		queue.enqueue(80);
		queue.enqueue(90);
		queue.display();
		
		
	}

}
