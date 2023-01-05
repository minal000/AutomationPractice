package propertyfile;

import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		
		//property file location
		String fileLocation="F:\\Accleration\\PROGRAMS\\Eclipse\\Java basic programs\\MyProp\\TestData.properties"
		//create an instance of FileInputStream class and pass file locaation to its constructor
		FileInputStream fis = new FileInputStream(fileLocation);		
		// create an instance of Properties class object
		Properties prop = new Properties();
		//call load method of property class to load property file
		prop.load(fis);
		//use getProperty(String key) to read specified key value for property file
		String userName = prop.getProperty("username");
		System.out.println("username from property file : "+userName);
		
		System.out.println("password from property file : "+prop.getProperty("password");
		// TODO Auto-generated method stub

	}

}
