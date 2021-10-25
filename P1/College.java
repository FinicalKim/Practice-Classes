package P1;

public class College {

	protected int x = 2;
	protected double z= 3.3;
	protected String name = " CSC";	
			
	public College()
	{
		
		System.out.println("I'm inside the super class");
	
	}
	
		// Deep Copy Constructor
	public College(College c)
	{
		this.x = c.x;
		this.z = c.z;
		this.name = c.name;
		
	
	}
	
	protected void m1()
	{
		
		System.out.println("CSC110");
	}

}
