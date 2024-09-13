package circularQueue;

import java.util.Scanner;

public class CircularQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue cq=new CircularQueue(5);
		Scanner sc=new Scanner(System.in);
		
		int choice;
		
		
		do 
		{
			System.out.println("Enter the choice :"
					+ "\n0.Exit \n1.push \n2.pop \n3.peek ");
			choice=sc.nextInt();
			switch(choice)
			{
			   case 1:
				   if(cq.isFull())
				   {
					   System.out.println("Queue is full ");  
				   }
				   else
				   {
					   System.out.println("Enter the data");
					   int data=sc.nextInt();
					   cq.push(data);
				   }
				      break;
			   case 2:
				   if(cq.isEmpty())
				   {
					   System.out.println("Queue is empty ");
				   }
				   else
				   {
					   System.out.println("Pop element is "+cq.pop());
				   }
				   
					  break;
			   case 3:
				   if(cq.isEmpty())
				   {
					   System.out.println("Queue is empty ");
				   }
				   else
				   {
					   System.out.println("Peeked element is "+cq.peek());
					   
				   }
					  break;
				  
				  
			}
		}while(choice!=0);
		
		

	}

}
