package array;

public class Array1 {

	public static void main(String[] args) {
		int a[] = new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		a[0]=10;   //initialization
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println("--------after initialization---------");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println("array element count : "+a.length);
		System.out.println("-----for loop------");
		for(int i =0 ; i<a.length ; i++) {
			System.out.println(a[i]);
		}
		System.out.println("---------for-each loop-------");
		for(int i : a) {
			System.out.println(i);
		}
		
		
		//for-each loop
		/**
		 * LHS should be same as RHS type in form of datatype or class 
		 * for(LHS = RHS){
		 * }
		 */
		for (int num : a) {
			System.out.println(num);
		}
		
		char getarray[]= new char[4];
		getarray[0]='A';
		getarray[0]='B';
		getarray[0]='C';
		getarray[0]='D';
		
		//or
		
		char getarray2[] = {'A' , 'B', 'C', 'D'};
		
		//or
		
		char getarray3[] = new char[] {'A','B','C','D'};
		
		System.out.println("---for-each loop----");
		 for(char num : getarray3) {
			 System.out.println(num);
		 }
		// TODO Auto-generated method stub

	}

}
