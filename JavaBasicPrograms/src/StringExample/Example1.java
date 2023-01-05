package StringExample;

public class Example1 {

	public static void main(String[] args) {
		/**
		 * String class object can be create in two ways:
		 * 1. using literals
		 * 2. using new keywords
		 */
		String s1 = "Banglore";
		String s2 = "Mumbai";
		String s3 = "Banglore";  //no new object will be created as its a duplicate object
		
		System.out.println("S1 : "+s1);
		System.out.println("S2 : "+s2);
		System.out.println("S3 : "+s3);
		System.out.println("********************************************");
		System.out.println("Compare s1 amd s2 object based on address : "+(s1==s2));
		System.out.println("Compare s2 amd s3 object based on address : "+(s2==s3));
		System.out.println("Compare s1 amd s3 object based on address : "+(s1==s3));
		System.out.println("****************************************************");
		System.out.println("Compare s1 amd s2 object based on value : "+s1.equals(s2));
		System.out.println("Compare s2 amd s3 object based on value : "+s3.equals(s2));
		System.out.println("Compare s1 amd s3 object based on value : "+s1.equals(s3));
		
		
		/**
		 *In string some methods of object class are override
		 * 1. toString()---> to represent object in string format but in String class it will give values stored in the object
		 * 2. equals() --->to compare two object based on address but in String it compares two object based on there value
		 * ==  to comapare two values but in string class it compares two object based on address
		 */
		// TODO Auto-generated method stu

	}

}

 