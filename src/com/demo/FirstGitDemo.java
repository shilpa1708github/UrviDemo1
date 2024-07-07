package com.demo;

public class FirstGitDemo {
	
	public void getAddition(int a,int b) {
		int sum =a+b;
		System.out.println("Addition of two number is >>" +sum);
	}

	public static void main(String[] args) {

		System.out.println("Hello team....");
		FirstGitDemo FirstGitDemo = new FirstGitDemo();
		FirstGitDemo.getAddition(10, 20);
		
	}

}
