import java.util.Scanner;

public class QueueMain {
	
	public static void main(String[] args) 
	{
		Queue q=new Queue(5);
		
		Scanner sc=new Scanner(System.in);
		int choice;
//		System.out.println("Enter the choice \n0.Exit \n1.push \n2.pop \n3.peek");
//		int choice=sc.nextInt();
		
		
		
		do{
			System.out.println("Enter the choice \n0.Exit \n1.push \n2.pop \n3.peek");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1://push
				if(q.isFull())
				{
					System.out.println("Queue is full !!");
				}
				else
				{
					System.out.println("Enter the value ");
					int data=sc.nextInt();
					q.push(data);
				}
			break;
				
			case 2://pop
				if(q.isEmpty())
				{
					System.out.println(" Queue is empty !!");
				}
				else
				{
					q.pop();
					//System.out.println("Peeked element "+ q.pop());
				}
				break;
				
			case 3://peek
				if(q.isEmpty())
				{
					System.out.println(" Queue is empty !!");
				}
				else
					System.out.println("Peeked element "+q.peek());
				break;
              			
			}
			
			
		}while(choice!=0) ;

	}
	
	
}
