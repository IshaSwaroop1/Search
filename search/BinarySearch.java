package com.globalLogic.search;
import java.util.*;
public class BinarySearch {
public boolean search(int start,int end,int num,int arr[]) {
	if(start<=end) {
	int mid=(start+end)/2;
	if(arr[mid]==num) {
		return true;
	}
	 if(num>arr[mid]) {
		return search(mid+1,end,num,arr);
	}
	if(num<arr[mid]) {
		return search(start,mid-1,num,arr);
	}
	

}
	return false;
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=sc.nextInt();
	int arr[]=new int[n];
    System.out.println("Enter the values in the array");
    for(int i=0;i<n;i++) {
    	arr[i]=sc.nextInt();
    }
    System.out.println("Enter the elements to be searched");
    int num=sc.nextInt();
    BinarySearch bs=new BinarySearch();
    boolean result=bs.search(0,n-1,num,arr);
    System.out.println(result);
}
}
