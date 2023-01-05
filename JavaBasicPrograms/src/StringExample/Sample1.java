package StringExample;
 
 final class ImmutableClass {
 /**
  * class and class member should be declared as final
  * constructor should be parameterized ,so that data member can be initialized
  * only getter() method should be written in the class for data members 	
  */
	final String name ; 
	final double salary ;
	ImmutableClass(String name , double salary) {
		this.name = name ; 
		this.salary = salary;
	}
	
	public String getname() {
		return name; 
	}
	
	public double getsalary() {
		return salary; 
	}
}
public class Sample1 {

	public static void main(String[] args) {
		ImmutableClass obj = new ImmutableClass("Minal", 50000);
		System.out.println(obj.getname());
		System.out.println(obj.getsalary());
		
//         obj.name="Pune";
//         obj.salary=50000;
		
		ImmutableClass obj1 = new ImmutableClass("Ratna",10000);
		System.out.println(obj1.getname());
		System.out.println(obj1.getsalary());
		
	}

}
