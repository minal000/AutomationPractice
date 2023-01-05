package System_Scanner;

public class SystemArrayCopyExample1 {

	public static void main(String[] args) {
		String a[] = {"A" , "B" , "B" , "H" , "A" , "M" } ;  //SOURCE array
		String b[] = {"S","H","U","N","U","L","L","J","A","D","O","N"};  //destination array
		String src[], dest[] ;
		int srcPos, destPos, length;
		src = a;
		srcPos =2;
		dest = b;
		destPos =3;
		length = 4 ;
		System.out.println("Source array: ");
		for(int i =0 ; i < src.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println();
		System.out.println("Source position: "+ srcPos);
		System.out.println("Length: "+length);
		System.arraycopy(src, srcPos, dest, destPos, length);  //use of arraycopy() method
		System.out.println("Destination array after use of arrycopy()");
		for( int i= 0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		// TODO Auto-generated method stub

	}

}
