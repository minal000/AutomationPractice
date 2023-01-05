package collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetExample2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ravi");
		System.out.println("List elements : "+list);
		
		//converting list element into set, by creating obj of set and  in that passing list through constructor
		HashSet<String> set = new HashSet<String>(list);
		System.out.println("Initial set elements: "+set);
		set.add("Gaurav");
		System.out.println("set elements: "+set);
		
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("****************************");
		
		set.forEach(s1 ->{
			System.out.println(s1);
		});
		
		System.out.println("*******************************");
		
		set.removeIf(s1 ->s1.contains("Ravi"));
		System.out.println("set elements : "+set);
		}
		
		// TODO Auto-generated method stub

	}


