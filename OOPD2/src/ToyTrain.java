import java.util.*;
class FirstClass{
	private int seatCapacity; 
	int checkCompartments(int first_comp) {
		seatCapacity = first_comp * 4;
		return seatCapacity;	
		}
	
}
class SecondClass{
	private int seatCapacity; 
	int checkCompartments(int second_comp) {
			seatCapacity = second_comp * 6;
			return seatCapacity;
			
		}
	}
	
class Train{
	private FirstClass fc;
	private SecondClass sc;
	private int first_comp, second_comp;
	Train(FirstClass f, SecondClass s, int first_comp,int second_comp){
		fc = f;
		sc = s;
		this.first_comp = first_comp;
		this.second_comp = second_comp;
	}
	private int seatFirstCapacity, seatSecondCapacity;
	void call() {
		seatFirstCapacity = fc.checkCompartments(first_comp);
		seatSecondCapacity = sc.checkCompartments(second_comp);
		
	}
	void display() {
		
			System.out.println("Seating capacity for first class is "+seatFirstCapacity);
			System.out.println("Seating capacity for second class is "+seatSecondCapacity);
			System.out.println("Total seating capacity is "+(seatFirstCapacity+seatSecondCapacity));
		}
		
	}
	
public class ToyTrain {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
		System.out.println("enter the number of first class compartment");
		int first_compartment = s.nextInt();
		if(first_compartment > 5)
			System.out.println("Number of compartments for first class are invalid");
		else {
		System.out.println("enter the number of second class compartment");
		int second_compartment = s.nextInt();
		if(second_compartment > 8)
			System.out.println("Number of compartments for second class are invalid");
		else if (first_compartment <= 5 && second_compartment<= 8) {
				FirstClass f = new FirstClass();
				SecondClass sc = new SecondClass();
				Train t = new Train(f,sc,first_compartment,second_compartment);
				t.call();
				t.display();
			}	
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		s.close();
	}
	
}

