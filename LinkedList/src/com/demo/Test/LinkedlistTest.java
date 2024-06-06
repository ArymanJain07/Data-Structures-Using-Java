package com.demo.Test;

import com.demo.LinkedList.LinkedList;

public class LinkedlistTest {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.displayNode();
		System.out.println("-------------");
		list.addNode(50);
		list.addNodePos(60, 3);
		list.displayNode();
		
		
	}

}
