package sample;

import java.util.Scanner;
import java.math.BigInteger;

public class Fact_stack {

	Stack top;
	int size;
	Fact_stack()
	{
		size=0;
		top=null;
	}
	class Stack{
		BigInteger data;
		Stack link;
	
		Stack()
		{
			data=BigInteger.valueOf(0);
			link=null;	
		}
		Stack(BigInteger item)
		{
			data=item;
			link=null;
		}
		
		
		
		
	}
	BigInteger peek()
	{
		if(top==null)	return BigInteger.valueOf(-1);
		return top.data;
	}
	BigInteger pop()
	{
		if(top == null)
		{System.out.print("underflow");
			return BigInteger.valueOf(-1);
		}
		else {
			size--;
			BigInteger temp = top.data;
			top = top.link;
			return temp;
			
		}
		
	}
	void push(BigInteger item)
	{
		if(top == null)
		{	
			Stack n = new Stack(item);
			top = n;
			size++;
		}
		else {
			Stack n = new Stack(item);	
			n.link = top ;
			top = n;
			size++;
			}
	}
	
	
	void multiply(Fact_stack s2,Fact_stack s3)
	{
		BigInteger x,y,temp,ten;
		x = new BigInteger("0");
		temp=new BigInteger("0");
		
	
		ten=new BigInteger("10");
		Stack t=top;
		int i,count=0;
		BigInteger one=new BigInteger("1");
		while(t!=null)
		{
			count++;
			t=t.link;
		}
	
		BigInteger m=new BigInteger("1");
		for(i=0; i<count ;i++)
		{
			x=pop();
			
			y=s2.peek();
			
			temp=x.multiply(y);
			temp=temp.multiply(m);
		
			m=m.multiply(ten);
			
			s3.push(temp);
		}
		
	}
	
	
	void digit(BigInteger x)
	{
		push(x);
	}
	
	
	void addition()
	{
		
		BigInteger x,y,result;
		Stack t=top;
		
		while(t.link!=null)
		{
		x=pop();
		y=pop();
		result=x.add(y);
		
		push(result);
		t=t.link;
		
		}
			
	}
	void display()
	{
		Stack t=top;
		
		while(t!=null)
		{
			System.out.println(t.data);
			t=t.link;
		}
		System.out.print("\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fact_stack[] fs=new Fact_stack[3];
		for(int i=0;i<3;i++)
		{
			fs[i]=new Fact_stack();
		}
		
		int N;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		if(N<=1000)
		{
	
		BigInteger n1=BigInteger.valueOf(N);

		BigInteger n2,q,r;
		String s2;
		char[] c2;
		String s1=n1.toString();
		char[] c1=s1.toCharArray();
		for (int i = 0; i < c1.length; i++) { 
			q=BigInteger.valueOf(c1[i]-48);
            fs[0].digit(q);
			
        }
				
	
		
		n2=BigInteger.valueOf(N-1);
		fs[1].digit(n2);
		
		
		fs[0].multiply(fs[1],fs[2]);
		
		fs[2].addition();
		fs[1].push(fs[2].pop());
	
		for(int i = n1.intValue()-2 ;i > 1; i--)
		{
			s2=Integer.toString(i);
		
			c2=s2.toCharArray();
			

			for (int j = 0; j < c2.length; j++) { 
				
				r=BigInteger.valueOf(c2[j]-48);
	            fs[0].digit(r);
			}	
			
		
		fs[0].multiply(fs[1],fs[2]);
		fs[2].addition();
		fs[1].push(fs[2].pop());
		}
	BigInteger result=fs[1].peek();
		System.out.print(result);
		}
		else
			System.out.println("N must be less than 1000");
		s.close();
		
	}

}