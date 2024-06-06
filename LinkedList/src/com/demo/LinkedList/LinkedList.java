package com.demo.LinkedList;

public class LinkedList {

	public Node head;
	class Node{
		
		int data;
		Node next;
		public Node() {
			data=0;
			next=null;
			
		}
		
		public Node(int val) {
			data=val;
			next=null;
		}
		
	}
	
	
	
	public void addNode(int val) {
		
		Node newNode = new Node(val);
		
		if(head==null) {
			head=newNode;
		}else {
			
			Node temp=head;
			
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
	}
	
	public void addNodePos(int val,int pos) {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			
			Node newNode = new Node(val);
			
			if(pos==1) {
				newNode.next=head;
				head=newNode;
				Node temp=head;
				for(int i=0;temp!=null&&i<pos-2;i++) {
					temp=temp.next;
				}
				if(temp!=null) {
					newNode.next=temp.next;
					temp.next=newNode;
				}
			}
			
		}
	}
	
	public void displayNode() {
		if(head==null) {
			System.out.println("list is empty");
		}
//		Node temp=head;
//		System.out.println(temp.data);
	
//		while(temp.next!=null) {
//			temp=temp.next;
//			System.out.println(temp.data+",");
//		}
		
		Node temp;
		for(temp=head;temp.next!=null;temp=temp.next) {
			System.out.println(temp.data+",");
		}
		System.out.println(temp.data+",");
	}
	
	
}
