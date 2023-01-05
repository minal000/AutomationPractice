package array;

public class Array2 {

	public static void main(String[] args) {
		//create an (type[]) collection.toArray(new type[collection.size()])
		 int age[] = {12 ,4, 25, 2 , 5};
		 //accessing each array element
		 System.out.println("first element : "+age[0]);
		 System.out.println("second element : "+age[1]);
		 System.out.println("third element : "+age[2]);
		 System.out.println("fourth element : "+age[3]);
		 System.out.println("fifth element : "+age[4]);
		 System.out.println("array size : "+age.length);
		 System.out.println("------for loop-----------");
		 for(int i=0 ; i<age.length ; i++) {
			 if(age[i]==25)
			 System.out.println(age[i]);
			 break;
		 } else {
			 System.out.println("age is not 25");
		 }
		 
		// TODO Auto-generated method stub

	}

}
