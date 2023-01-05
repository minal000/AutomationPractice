package string_assignment;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "My name   is   Minal .";
		System.out.println("String before removing white spaces : "+str);
		
		String s = str.replaceAll("\\s", "");
		System.out.println("String after removing white spaces : "+s);

	}

}
