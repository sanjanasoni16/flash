package sample;

public class stack_list {
	Node top;
	int size;
	class Node{
		int data;
		Node link;
		Node()
		{
			top=null;
			size=0;
			data=0;
			link=null;
		}
		Node(int item)
		{
			data=item;
			link=null;
		}
	}
	

	void push(int item)
	{
		if(top == null)
		{	
			Node n = new Node(item);
			top = n;
			size++;
		}
		else {
			Node n = new Node(item);	
			n.link = top ;
			top = n;
			size++;
			}
	}
	  
	int pop()
	{
		if(top == null)
		{System.out.print("underflow");
			return -1;
		}
		else {
			size--;
			int temp = top.data;
			top = top.link;
			return temp;
			
		}
		
	}
	
	int size_s()
	{
		return size;
	}
	int peek()
	{
		return top.data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack_list sl= new stack_list();
		sl.push(11);
		sl.push(22);
		sl.push(33);
		sl.push(44);
		System.out.print("the size of stack is "+sl.size_s()+"\n");
		
		System.out.print("the topmost element is "+sl.peek()+"\n");
		
		System.out.print("the popped element is "+sl.pop()+"\n");
		System.out.print("the popped element is "+sl.pop()+"\n");
		
		System.out.print("the size of stack is "+sl.size_s()+"\n");
		
		System.out.print("the topmost element is "+sl.peek()+"\n");
	}

}
