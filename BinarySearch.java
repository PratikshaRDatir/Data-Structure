package BinarySearch;

import java.util.Scanner;

public class BinarySearch1 {
	
	
	public static int binaraySearch(int arr[],int left,int right,int data) 
	{
		int mid;
		while(left<=right)
		{
			mid =(left+right)/2;
			
			if(arr[mid]==data)
			{
				return mid;
			}
			else if(arr[mid]>data)
			{
				right=mid-1;	
			}
			else
			{
				left=mid+1;
			}	
		}
		return -1;
		
	}
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
       
		int left=0;
		int right= arr.length-1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data ");
		int data=sc.nextInt();
	    int a=	binaraySearch(arr,left,right,data);
	    if(a!=-1)
	    {
	      System.out.println("Element found at "+a);	
	    }
	    System.out.println("Element not found ");
	   	

	 }

}
