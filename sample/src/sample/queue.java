package sample;

public class queue {
	
	int front=-1;
	int rear=-1;
	int q[]=new int[6];
	void enqueue(int item)
	{
		rear=(rear+1)%6;
		if(rear == front)
		{
				System.out.print("Overflow");
				if(rear==0)
					rear=5;
				else
					rear=rear-1;
		}
		else {
			q[rear]=item;
		}		
	}
	
	int dequeue()
	{
		if(rear==front)
		{
			System.out.print("Underflow");
			return -1;
		}
		else
		{
			front=(front+1)%6;
			int temp=q[front];
			q[front]=-1;
			return temp;
		}
	}
	void display()
	{
		for(int i=0; i<6; i++)
		{
			System.out.print(q[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		queue q=new queue();
		q.enqueue(1);
		q.enqueue(20);
		q.enqueue(32);
		q.enqueue(43);
		q.enqueue(54);
		q.enqueue(65);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(77);
		q.display();
	}

}
