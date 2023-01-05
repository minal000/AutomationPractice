package TypeCasting;

public class PrimitiveCasting1 {

	public static void main(String[] args) {
		
		System.out.println("*******explicit Widening********");
		int salary=30000;
		double salaryDouble = (double)salary;   //explicit widening
		float salaryFloat = (float)salary;   //explicit widening
		System.out.println("salary : "+salary);
		System.out.println("salaryDouble : "+salaryDouble);
		System.out.println("salaryFloat : "+salaryFloat);
		
		System.out.println("**********implicit Widening/Auto widening**********");
		double salaryDouble2 = salary;
		float salaryFloat2 = salary;
		System.out.println("salaryDouble2 : "+salaryDouble+"\nsalaryFloat2 : "+salaryFloat);
		System.out.println("---------------------");
		System.out.println("salaryDouble2 : "+salaryDouble2);
		System.out.println("salaryFloat2 : "+salaryFloat2);
		
		// TODO Auto-generated method stub

	}

}
