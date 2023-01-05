package ObjectClass;
class TestSample{
	void callMe() {
		System.out.println("Hello");
	}
}
public class Example4 extends TestSample{
	static int lastroll = 100;
	int rollno;
	//constructor
	Example4() {
		rollno = lastroll;
		lastroll++ ;
}
//@override
public int hashCode() {
		return 505;
	}
//@override
public String toString() {
	return "BasicCoreJava" ;
}
//Driver code
	public static void main(String[] args) {
		Example4 s = new  Example4() ;
		//below two statements are equivalent
		System.out.println(s.hashCode());
		System.out.println(s);
		TestSample t1 = new TestSample() ;
		System.out.println(t1);
		System.out.println(t1.hashCode());
		// TODO Auto-generated method stub

	}

}
