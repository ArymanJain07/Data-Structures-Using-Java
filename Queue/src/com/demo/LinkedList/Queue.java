package com.demo.LinkedList;

public class Queue {

	Node front=null,back=null;
	class Node{
		int data;
		Node next;
		
		public Node(int val) {
			data=val;
			next=null;
		}
	}
	
	public void enqueue(int val) {
		
		Node newNode = new Node(val);
		
		if(front==null&&back==null) {
		
			front=newNode;
			back=newNode;
			System.out.println(val+": Added in queue");
		}else {
			back.next=newNode;
			back=newNode;
			System.out.println(val+": Added in queue");
		}
	}
	
	public void dequeue() {
		
		if(back==null&&front==null) {
			System.out.println("Queue is Empty ");
		}else {
			
			Node temp=front;
			System.out.println(temp.data+": Data deleted");
			front=front.next;
			temp.next=null;
			temp=null;
			
		}
		
	}
	
	public void display() {
		System.out.print("Queue|");
		for(Node temp=front;temp!=back;temp=temp.next) {
			
			System.out.print("-->");
			System.out.print(temp.data);
			
		}
		System.out.println();
	}
}
