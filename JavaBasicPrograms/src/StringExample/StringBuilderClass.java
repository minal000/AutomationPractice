package StringExample;

public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		sb.append("Pune");
		System.out.println(sb);
		
		StringBuilder s1 = new StringBuilder("Hello Pune");
		StringBuilder s2 = new StringBuilder("Hello Pune");
		System.out.println(s1.equals(s2));    //compare on the basis of address
		System.out.println(s1==s2);         // it will also on the basis of address
		 
        //in String buffer and string builder can not comapre on the basis of value
		//for this to overcome that ,first convert String buffer/builder to string class using toString()
		//then use equals() of String class
		System.out.println(s1.toString().equals(s2.toString()));
	}

	


}
