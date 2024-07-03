package com.sunbeam;

import java.util.Scanner;

public class LinearSearchMain {
	
	public static int linearSearch(int arr[], int n, int data) {
		//1. traverse array from 0th to n-1 th index
		for(int i = 0 ; i < n ; i++) {
			//2. compare data with ith element
			if(data == arr[i])
				//3. if matching return i
				return i;
		}
		//4. if data is not found
		return -1;		
	}

	public static void main(String[] args) {
		int arr[] = {88, 33, 66, 99, 11, 77, 22, 55, 14};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Data to be searched : ");
		int data = sc.nextInt();
		
		int ret = linearSearch(arr, arr.length, data);
		if(ret != -1)
			System.out.println("Data is found at index : " + ret);
		else
			System.out.println("Data is not found");
		
		sc.close();

	}

}
