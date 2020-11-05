import java.util.Scanner;

class Vehicle{
	protected int Registration_No;
	protected int Year_of_Manufacturing;
	protected String Fuel_type;
	protected String Colour;
	private String Owner;
	private String Servicing_date;
	String update_owner(String ownername) {
		Owner = ownername;
		return Owner;
	}
	String update_servicing_date(String servicedate)
	{
		Servicing_date = servicedate;
		return Servicing_date;
	}
}

	
class Truck extends Vehicle{
	protected int Capacity;
	protected String Permit;
	private String Pollution_Check_date;
	private String Driver_name;
	String update_pollution_check_date(String pollution_checkdate) {
		Pollution_Check_date = pollution_checkdate;
		return Pollution_Check_date;
	}
	String update_driver_name(String drivername) {
		Driver_name = drivername;
		return Driver_name;
	}
}
public class MainVeh {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
		Truck t = new Truck();
		t.Registration_No = 19097;
		t.Year_of_Manufacturing = 2012;
		t.Fuel_type = "LPG";
		t.Colour = "Black";
		t.Capacity = 200; // capacity in kg
		t.Permit = "allowed";
		
		System.out.println("enter the owner name to update");
		String ownername = s.nextLine();
		String own_name=t.update_owner(ownername);
		System.out.println("enter the servicing date to update");
		String servicedate = s.nextLine();
		String serv_date=t.update_servicing_date(servicedate);
		System.out.println("enter the pollution check date to update");
		String pollution_checkdate = s.nextLine();
		String poll_checkdate=t.update_pollution_check_date(pollution_checkdate);
		System.out.println("enter the driver name to update");
		String drivername = s.nextLine();
		String drive_name=t.update_driver_name(drivername);
		
		System.out.println("Updated owner name is " + own_name);
		System.out.println("Updated servicing date is " + serv_date);
		System.out.println("Updated pollution check date is " + poll_checkdate);
		System.out.println("Updated driver date is " + drive_name);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		s.close();
	}
}