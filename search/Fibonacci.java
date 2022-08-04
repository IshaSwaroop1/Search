package com.globalLogic.search;

public class Fibonacci {
public static void main(String args[]) {
	int a=1;
	int b=1;
	System.out.print(a+" "+b+" ");
	int sum=0;
	for(int c=2;c<10;c++) {
		sum=a+b;
		System.out.print(sum+" ");
		a=b;
		b=sum;
		
	}
}
}
