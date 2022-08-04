package com.globalLogic.search;
import java.util.*;
public class BinarySearchS {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements in the array");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the element to be searched");
	int s=sc.nextInt();
	int start=0;
	int end=n-1;
	int flag=0;
	while(start<=end) {
		int mid=(start+end)/2;
		if(arr[mid]==s) {
		  flag=1;
			break;
		}else if(arr[mid]>s) {
			end=mid-1;
		}
		else if(arr[mid]<s) {
			start=mid+1;
		}
	}
	if(flag==0) {
		System.out.println("Element not found");
	}else {
		System.out.println("Element found");
	}
	
}
}
