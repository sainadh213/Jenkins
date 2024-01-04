package Sai;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.MyListeners;


@Listeners(MyListeners.class)
public class PracticeListeners {
	
	
	@Test
	public void first()
	{
		//System.out.println("This is first method");
	}

	@Test
	public void second()
	{
		Assert.fail();
	}
	
	@Test(dependsOnMethods ="second")
	public void third()
	{
		
	}
}
