import java.util.*;
class Sheet{
	private float area = 0;
	float calculateSheetArea(float r, float L){
		area = 2 * 3.14f * r * L ;
		return area;
	}
}
class Disk{
	private float d_area=0;
	float calculateDiskArea(float r) {
		d_area = 3.14f * r * r;
		return d_area;
	}
}

class Cylinder{
	private Sheet ms;
	private Disk d1,d2;
	private float r, L;
	Cylinder(Sheet S, Disk D1, Disk D2,float rad, float len){
		ms = S;
		d1 = D1;
		d2 = D2;
		r = rad;
		L = len;
	}
	private float sheetArea,diskArea1,diskArea2;
	void call()
	{	
	sheetArea=ms.calculateSheetArea(r,L);
	diskArea1=d1.calculateDiskArea(r);
	diskArea2=d2.calculateDiskArea(r);
	System.out.println("Metal sheet area is "+sheetArea);
	System.out.println("Disk area of first end is "+diskArea1);
	System.out.println("Disk area of second end is "+diskArea2);
	}
	
	
	
}

public class Cylinder_tube {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		try {
		System.out.println("enter the radius of the disk");
		float r = s.nextFloat();
		System.out.println("enter the length of the sheet");
		float L = s.nextFloat();
		Sheet ms = new Sheet();
		Disk d1 = new Disk();
		Disk d2 = new Disk();
		Cylinder c = new Cylinder(ms,d1,d2,r,L);
		c.call();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		s.close();
	
	}
	
}

