package ObjectClass;
class Print12{
	int a= 10;
	//@override
	public int hashCode() {
		return 101;
	}
	//@override
	public String toString() {
		return "I am print12 class toString" ;
	}
}
public class Example5 {

	public static void main(String[] args) {
		Example5  s1 = new Example5() ;
		System.out.println("s: toString of ObjectClass5: "+s1);
		System.out.println("s: hashCode of ObjectClass5: "+s1.hashCode());
		Example5 s2 = new Example5() ;
		System.out.println("s: toString of ObjectClass5: "+s2);
		System.out.println("s: hashCode of ObjectClass5: "+s2.hashCode());
		System.out.println("s1 and s2 compare: "+s1.equals(s2)); //false
		
		Example5 s3 = s2 ; //ObjectClass03 s3 = s2 = new ObjectClass03() ;
		System.out.println("s2 and s3 compare: "+s3.equals(s2));   //true
		
		Print12 p1 = new Print12() ;
		System.out.println("toString of Print: "+p1);
		System.out.println("hashCode of Print: "+p1.hashCode());
		
		Print12 p2 = new Print12() ;
		System.out.println("toString of Print: "+p2);
		System.out.println("hashCode of Print: "+p2.hashCode());
		System.out.println("Comparing print class object p1 and p2 with overriden equals() : " +p1.equals(p2)); //false
	
		
		
		
		
		
		
		
		
		
		
		/**
		 * == ---> compare two values
		 * d1.equals(d2) ---> compare two objects based on there address
		 */
		// TODO Auto-generated method stub

	}

}
