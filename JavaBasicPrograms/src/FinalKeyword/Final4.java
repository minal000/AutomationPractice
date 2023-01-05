package FinalKeyword;

public class Final4 {
	int cube (final int n ) {
		System.out.println(n);
	//	n= n+2 ;                  //due to this we will get error in this program, as here value of n is changing
		return n*n*n ;
	}

	public static void main(String[] args) {
		Final4 obj = new Final4() ;
		System.out.println( obj.cube(5) ) ;
		
		// TODO Auto-generated method stub

	}

}
