package sample;

public class linkedlist {
	Node head;
	class Node{
		int data;
		Node next;
		Node(){
			data=0;
			next=null;
		}
		Node(int data){
			this.data=data;
			this.next=null;
		}
		Node(int data,Node next){
			this.data=data;
			this.next=next;
		}
		
	}
	public void insert(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
		}
		else {
			Node p=head;
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=n;
		}
	}
	public void show()
	{
		Node p=head;
		while(p!=null)
		{
			System.out.print(p.data + " ");
			p=p.next;
		}
	}
	public static void main(String arg[])
	{
		System.out.print("hello");
		linkedlist l=new linkedlist();
		l.insert(2);
		l.insert(5);
		l.insert(8);
		l.insert(0);
		l.show();
	}

	
	
}
