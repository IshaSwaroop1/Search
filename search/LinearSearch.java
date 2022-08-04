package com.globalLogic.search;
import java.util.*;
public class LinearSearch {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the values in the array");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the element to be searched");
	int a=sc.nextInt();
	for(int i=0;i<n;i++) {
		if(arr[i]==a) {
			System.out.println("Number is present");
			break;
		}
		if(i==n-1) {
			System.out.println("Number is not present");
		}
	}
}
}
