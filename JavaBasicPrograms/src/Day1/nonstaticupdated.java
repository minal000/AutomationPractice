package Day1;

public class nonstaticupdated {
	int salary=45000;
    int empid=0001;
	public static void main(String[] args) {
		System.out.println("Program start..");
		nonstaticupdated S= new nonstaticupdated();
		System.out.println("Salary of Yogesh "+S.salary);
		System.out.println("employee id of Yogesh is "+S.empid);
		
		//updated salary
		S.salary=55000;
		S.empid=0002;
		System.out.println("updated Salary of Yogesh is "+S.salary);
		System.out.println("Updated employee id is "+S.empid);
		// TODO Auto-generated method stub

	}

}
