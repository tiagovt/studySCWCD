import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import com.sun.org.apache.bcel.internal.generic.NEW;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = null;
        Calendar cal = Calendar.getInstance();
//		GregorianCalendar cal = new GregorianCalendar();
    	try {
//    		date = new SimpleDateFormat("dd/MM/yyyy");
    		cal.setTimeZone(TimeZone.getDefault());
//    		cal.setTime(date);
    		
    		
    		GregorianCalendar calAux = new GregorianCalendar();
    		
    		TimeZone timezone = TimeZone.getTimeZone("GMT-03:00");
    		calAux.set(Calendar.HOUR, timezone.getRawOffset());
    		SimpleDateFormat formater2 = new SimpleDateFormat("HH:mm");
    		System.out.println(formater2.format(calAux.getTime()));
    		
	        SimpleDateFormat formatter = new SimpleDateFormat();
    		formatter.applyPattern("yyyy-MM-dd'T'HH:mm:ssZ");
    		System.out.println(formatter.format(cal.getTime()));
    		System.out.println("Antes Calendario: " + cal.getTime().toString());
			
    		formatter.setCalendar(cal);
    		formatter.setTimeZone(TimeZone.getTimeZone("GMT-03:00"));
	        	
			System.out.println("Calendario: " + cal.getTime().toString());
			
		      
	      // checking offset value for date      
	      System.out.println("Offset value:" + 
	      timezone.getOffset(Calendar.ZONE_OFFSET) / 1000 * 60);
	      Calendar cal2 = Calendar.getInstance();
	      System.out.println(timezone.getRawOffset());
	      cal2.set(Calendar.HOUR, 10800000 );
	      System.out.println(cal2.getTime());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

	}

}
