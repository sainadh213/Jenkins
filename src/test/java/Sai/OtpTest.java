package Sai;

import java.util.Random;

import org.testng.annotations.Test;

public class OtpTest {
	
@Test
public void getOtpTest(){
	
	Random rm=new Random();
int otp = rm.nextInt(999999);
String abc = Integer.toString(otp);
if(abc.length()==6)
	
	System.out.println(abc);
	
}
}
