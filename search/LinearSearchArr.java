package com.globalLogic.search;
import java.util.*;
public class LinearSearchArr {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer>arr=new ArrayList<>(10);
	System.out.println("Enter the elements in the arrayList");
	int a;
    for(int i=0;i<10;i++) {
    	a=sc.nextInt();
    	arr.add(a);
    }
    System.out.println("Enter the element to be searched");
    int s=sc.nextInt();
    if(arr.contains(s)) {
    	System.out.println("True");
    }
    else {
    	System.out.println("False");
    }
}
}
