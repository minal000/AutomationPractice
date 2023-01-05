package ObjectClass;
class Print extends Object {
	 int a=10 ;
	 //@override
	 public int hashCode() {
		 return 101 ;
	 }
	 //@override
	 public String toString() {
		 return "I am print class toString" ;
	 }
	 //@override
	 public boolean equals(Object obj) {    //Object obj = p2 = new Print();  //auto upcasting
		 Print p = (Print)obj;  //explicit downcasting
		 return (this.a == p.a );
			      //10 == 10
	 }
}
public class Example6 {
	static int lastroll = 100 ;
	int rollno;
	Example6() {
		rollno = lastroll ;
		lastroll++ ;
	}

	public static void main(String[] args) {
		Example6 s1 = new Example6() ;
		System.out.println("s: toString of ObjectClass6: "+s1);
		System.out.println("s: hashCode of ObjectClass6: "+s1.hashCode());
		
		Example6 s2 = new Example6() ;
		System.out.println("s: toString of ObjectClass6: "+s2);
		System.out.println("s: hashCode of ObjectClass6: "+s2.hashCode());
		System.out.println("s1 and s2  compare : "+s1.equals(s2));  //false
		
		Example6 s3 = s2 ;
		System.out.println("s3 and s2 compare: "+s3.equals(s2));//true
		
		Print p1 = new Print() ;
		System.out.println("toString of Print: "+p1);
		System.out.println("hashCode of Print : "+p1.hashCode());
		
		Print p2 = new Print() ;
		System.out.println("toString of Print: "+p2);
		System.out.println("hashCode of Print : "+p2.hashCode()); //
		System.out.println("comparing print class object p1 and p2 with overriden equals() : "+p1.equals(p2));  //true
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
