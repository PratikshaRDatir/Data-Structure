
public class Queue {
	
	int arr[];
	int front;
	int rear;
	int size;
	public Queue( int size) {
		super();
		this.size=size;
		arr= new int[size];
		this.front = -1;
		this.rear = -1;
	}
	
	public void push(int data)
	{
		  rear++;
		if(!isFull())
		{
			arr[rear]=data;
			//System.out.println();
		}
		else
			System.out.println("Fulled !!");
	}
	public void pop()
	{
			front++;
	}
	public int peek()
	{
	  return (arr[front+1]);	
	}
	public boolean isFull()
	{
		return rear==size-1;
	}
	public boolean isEmpty()
	{
		return front==rear;
	}

}
