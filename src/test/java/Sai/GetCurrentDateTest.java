package Sai;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentDateTest {

	public static void main(String[] args) {
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss");// This will give month in Alphabates
		// SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String currentDateandTime = sdf.format(dt);

		System.out.println(currentDateandTime);
	}

}
