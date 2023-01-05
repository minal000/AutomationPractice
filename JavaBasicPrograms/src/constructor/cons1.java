package constructor;

public class cons1 {
	cons1(){
		System.out.println("This is a Zero parameter constructor..");
	}
	cons1(int a){
		System.out.println("This is a single integer parameter constructor..");
	}
	cons1(char b){
		System.out.println("This is a single charater parameter constructor..");
	}
	cons1(int c, int d){
		System.out.println("THis is int-int parameter constructor..");
	}
	cons1(int e, char f){
		System.out.println("This is int-double parameter constructor..");
	}

	public static void main(String[] args) {
		cons1 obj1 = new cons1();
		cons1 obj2 = new cons1(45);
		cons1 obj3 = new cons1('A');
		cons1 obj4 = new cons1(3, 9);
		cons1 obj5 = new cons1(90, 'G');
		// TODO Auto-generated method stub

	}

}
