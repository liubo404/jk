package misc.times;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimePassedTest {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		long now = c.getTimeInMillis();
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		long passed = now - c.getTimeInMillis();
		long secondsPassed = passed / 1000;
		System.out.println(passed);
		System.out.println(secondsPassed);
		/*String bn = generateCheckoutBillno(7, 9);
		System.out.println(bn);*/
	}

	public static String generateCheckoutBillno(int moduel_id, int merchant_id) {
		DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		return formatter.format(new Date()) + String.format("%03d", moduel_id) + String.format("%06d", merchant_id)
				+ String.format("%08d", getSequence());
	}

	/**
	 * 取凌晨到现在的微秒数
	 * 
	 * @return
	 */
	public static Long getSequence() {
		Calendar c = Calendar.getInstance();
		long now = c.getTimeInMillis();
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		long passed = now - c.getTimeInMillis();
		return passed;
	}

}
