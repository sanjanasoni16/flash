package sample;

public class stack {
	int array_stack[]=new int[100];
	int top=-1;
	void push(int data)
	{
		if(top>=(array_stack.length))
			System.out.println("overflow");
		else {
			top=top+1;
			array_stack[top]=data;
		}
	}
	int pop()
	{
		int t=-1;
		if(top==-1)
			System.out.print("Underflow");
		else {
		 t=array_stack[top];
			top=top-1;
			//return t;
		}
		return t;
	}
	int size()
	{
		return top+1;
	}
	int topele()
	{
		return array_stack[top];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s=new stack();
		s.push(3);
		s.push(34);
		s.push(12);
	//int t=s.pop();
		System.out.println("the popped element of the stack is "+s.pop()+"\n");
		System.out.println("the size of the stack is "+s.size()+"\n");
		System.out.println("the top element of the stack is "+s.topele()+"\n");
	}

}
