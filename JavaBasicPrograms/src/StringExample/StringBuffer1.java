package StringExample;

public class StringBuffer1 {

	public static void main(String[] args) {
//		String str = "ABC";
//		str.
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Original String : "+sb);
		
		sb.append("Java");
		System.out.println("Updated String : "+sb);
		
		sb.insert(3, "Pune");
		System.out.println("New String becomes : "+sb);
		
		sb.replace(1, 05, "pppp");
		System.out.println("String become after replace : "+sb);
		
		sb.delete(1, 4);
		System.out.println("new string : "+sb);
		
		StringBuffer s1 = new StringBuffer("ABCD EFGH IJKL MNOP");
		s1.reverse();
		System.out.println("Reverse String : "+s1);
		
		System.out.println("-----------------------------");
		
		StringBuffer s2 = new StringBuffer();
		System.out.println("Default capacity of String Buffer : "+s2.capacity());
		s2.append("Hello very Good morning Everyone ");
		System.out.println("Now capacity of S2 is "+s2.capacity());  //(16*2)+2=34
		s2.append("Welcome to class");
		System.out.println(s2);
		System.out.println(s2.capacity());   //(34*2)+2=70
	}

}
