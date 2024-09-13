package circularQueue;

public class CircularQueue 
{
   int size;
   int arr[];
   int rear,front,count;

public CircularQueue(int size) {
	super();
	this.size =size;
	arr=new int[size];
	this.rear = -1;
	this.front = -1;
	this.count = 0;
}
public void push(int data)
{
	count++;
	rear=(rear+1)%size;
	arr[rear]=data;
}
public int pop()
{
	
	int data=arr[(front+1)%size];
	front=(front+1)%size;
	count--;
	return data;
	
}
public int peek()
{
	return arr[(front+1)%size];
}

public boolean isEmpty()
{
	return count==0;
}
   
public boolean isFull()
{
	return size==count;
}
   
}
