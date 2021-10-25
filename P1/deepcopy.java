package P1;

public class deepcopy extends copy{
		
	public static void main(String[] args) {
		
		copy obj1 = new copy();
		copy obj2 = new copy(obj1);
		
		obj2.x = 456;
		
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		System.out.println(obj1.x);
	}

}

	//deep copy constructor class
class copy{
	
	protected int x = 1;
	protected int y = 30;
	protected String name = "CSC205";
	
		//default constructor
	public copy() {
		
		
	}
		//constructor with one parameter
	public copy(copy c) {
		
		this.x = c.x;
		this.y = c.y;
		this.name = c.name;
		
	}
}
