package com.globalLogic.search;
import java.util.*;
public class FibonacciRe {

	public int fibo(int n) {
		if(n==0||n==1) {
			return n;
	
	}
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		FibonacciRe fb=new FibonacciRe();
		System.out.println(fb.fibo(10));
	}
}
