package com.user.arun.dsa.stack.array;

public class FixedCapacityStack {
	
	private Integer[] arr;
	private int n;
	
	public FixedCapacityStack(int capacity) {
		arr = new Integer[capacity];
	}
	
	public boolean isEmpty() {
		return n == 0;
	}
	
	public int size() {
		return n;
	}
	
	public void push(Integer item) {
		arr[n++] = item;
	}
	
	public Integer peek() {
		return size() > 0 ? arr[n-1] : null;
	}
	
	public Integer pop() {
		return arr[--n];
	}

}
