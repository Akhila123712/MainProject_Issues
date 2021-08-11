package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateUtil return TimeStamp and DateStamp
 */
public class Dateutil {
	public static String today_date;
	/*Note - this method returns present date ,time , year, month*/
	public static String getTimeStamp() {
	    Date date = new Date();    
		return date.toString().replaceAll(":", "_").replaceAll(" ", "_");
	}
	public static String getTodayDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");  
	    Date date = new Date();  
	    today_date=formatter.format(date);  
		return today_date;
	}
}
