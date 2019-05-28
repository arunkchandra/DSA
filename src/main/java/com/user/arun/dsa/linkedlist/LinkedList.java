package com.user.arun.dsa.linkedlist;

public class LinkedList {
	
	private Node head;
	private int size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void addAtHead(final int value) {
		Node node = new Node(value);
		if(isEmpty())
			head = node;
		else {
			node.next = head;
			head = node;
		}
		size++;
	}
	
	public void addAtEnd(final int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head = node;
		}else {
			Node currentNode = head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			Node previousEnd = currentNode;
			previousEnd.next = node;
		}
		size++;
	}
	
	public void deleteAtHead() {
		if(isEmpty()) {
			System.out.println("Cant delete list is Empty");
		}else {
			Node newHead = head.next;
			head = newHead;
			size--;
		}	
		
	}
	
	public void deleteAtEnd() {
		if(isEmpty()) {
			System.out.println("Cant delete list is Empty");
		}else {
			if(head.next == null) {
				head = null;
				size--;
				return;
			}
			Node lastButOne = head;
			while(lastButOne.next.next != null) {
				lastButOne = lastButOne.next;
			}
			lastButOne.next = null;
			size--;
		}
	}
	
	public void print() {
		if(isEmpty()) {
			System.out.println("LinkedList is Empty");
		}else {
			Node currentNode = head;
			while(currentNode != null) {
				System.out.print(currentNode.value);
				currentNode = currentNode.next;
			}
			System.out.println();
		}
	}
	
	private static class Node {
		private Node next;
		private int value;
		
		private Node(final int value) {
			this.value = value;
		}
	}
	

}
