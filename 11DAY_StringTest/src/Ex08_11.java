import java.sql.Date;
import java.util.Calendar;

public class Ex08_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2020, 07, 07);
		Date now = (Date) cal2.getTime();
		System.out.println(now);
	}

}
