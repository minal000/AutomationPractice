package StringExample;

public class Example4 {

	public static void main(String[] args) {
		Example4 c1 = new Example4() ;
		System.out.println(" c1 : "+c1);   //string representation of an object because of toString() 
		//string class object creation
		//1. using literal
		String s1 = "Mumbai" ;    //new obj will be created in string constant pool
		String s2 = "Mumbai" ;    //no obj will be created as its duplicate obj, so 's2' will points to 's1' obj
		String s3 = "Banglore" ;  //new obj will be created in string constant pool
		
		System.out.println("s1 : "+s1);   //object value because toString() is overrided in string class
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s1 char count : "+s1.length());
		System.out.println("s2 char count : "+s2.length());
		System.out.println("s3 char count : "+s3.length());
		
		/**
		 * Outside String class: 
		 *   ==  --> compare two values
		 *     .equals(obj)  --> compare two obj based on there address
		 * Inside String class:
		 *   == --> compare two obj based on address
		 *   .equal(obj) --> compare two obj based on value
		 */
		
		System.out.println("s1 and s2 using equals() : "+s1.equals(s2)); //compare s1 and s2 values
		System.out.println("s1 and s2 using '==' : "+(s1==s2) );   //compare s1 and s2 based on address
		
		System.out.println("s1 and s3 using equals() : "+s1.equals(s3)); //compare s1 and s3 values
		System.out.println("s1 and s3 using '==' : "+(s1==s3) );   //compare s1 and s3 based on address
		
		String s4 = new String("Mumbai");  //two objects --> 1. in constant pool 2. in non constant pool
		System.out.println("s4 : "+s4);
		
		System.out.println("s1 and s4 using equals() : "+s1.equals(s4)); //compare s1 and s4 values
		System.out.println("s1 and s4 using '==' : "+(s1==s4) );   //compare s1 and s4 based on address
		
		String s5 = new String("Mumabai");   //two objects --> 1. in constant pool 2. in non constant pool
		System.out.println("s5 : "+s5);
		
		System.out.println("s4 and s5 using equals() : "+s4.equals(s5)); //compare s4 and s5 values
		System.out.println("s4 and s5 using '==' : "+(s4==s5) );   //compare s4 and s5 based on address
		
		String s6 = new String("Hydrabad");  //two objects --> 1. in constant pool 2. in non constant pool
		System.out.println("s6 : "+s6);
		
		System.out.println("s1 and s6 using equals() : "+s1.equals(s6)); //compare s1 and s6 values
		System.out.println("s1 and s6 using '==' : "+(s1==s6) );   //compare s1 and s6 based on address
		
		
		
		
		
		
		/**
		 * String  --->
		 * 
		 * predefined class in java.lang package
		 * it represent group/collection of characters
		 * In string class following methods are override
		 * 
		 * 1. toString() --> instead of printing string representation of object it will print value stored inside the string object
		 * 2. equals()   -->  overrided
		 * 3. hashCode()
		 * 
		 *  we can create string class object in two ways
		 *  1. by using new Keyword   -->object will be stored in non constant pool
		 *                           -->by using this we can have duplicate object also
		 *                           
		 *  2. by using literal      --> object will be stored in the String constant pool (inside heap)
		 *                           -->by using this we can create only unique object inside the pool
		 */
		
		
		
		// TODO Auto-generated method stub

	}

}
