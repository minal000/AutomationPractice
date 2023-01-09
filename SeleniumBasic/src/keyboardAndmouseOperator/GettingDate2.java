package keyboardAndmouseOperator;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GettingDate2 {

	public static void main(String[] args) {
		
		//get calender class instance
		Calendar cal = Calendar.getInstance();
		
		//add number of days(+/-) based on your requirement
		cal.add(Calendar.DATE, 5);   //take it from date utility 12 & 15 line
		
		//Date class will you get the current System date
	     Date d1 = new Date(cal.getTimeInMillis());
				
		//SimpleDateFormat will help to get date in specific format
		SimpleDateFormat s = new SimpleDateFormat("dd/MMM/yyyy");
				
		//with the help of SimpleDateFormat you can convert your date into required format
		System.out.println(s.format(d1));

	}

}
