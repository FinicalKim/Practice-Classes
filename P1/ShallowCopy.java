package P1;

public class ShallowCopy {

	public static void main(String[] args) {
		
		College Obj1;	//Reference variable
		
		College Obj2 = new College();	// Create object of type College = Call default constructor in college class

		Obj1 = Obj2;	//Shallow copy
		
		System.out.println(Obj1.x);	//print the value of x inside obj1
		
		
		//DeepCopy example
		
		College Obj3 = new College();
		
		College Obj4 = new College(Obj3);	// Deep copy 
		
		Obj4.x = 200;
		System.out.println("\n\n");
		System.out.println(Obj4.x);
		
		System.out.println("\n\n");
		System.out.println(Obj3.x);
		
	}


}
