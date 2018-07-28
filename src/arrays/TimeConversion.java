package arrays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

	public static void main(String[] args) throws ParseException {
		  SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	         SimpleDateFormat givenFormat = new SimpleDateFormat("hh:mm:ssa");
	        Date d = givenFormat.parse("07:05:45PM");
	        System.out.println(format.format(d));
	}


}
