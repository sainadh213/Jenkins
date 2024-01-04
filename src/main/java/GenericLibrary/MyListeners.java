package GenericLibrary;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class MyListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println(result.getName()+" method started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(result.getName()+" method successed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println(result.getName()+" method failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" method skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Test Execution Stared");
		
	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println("Test Execution Finished");
	
		
	}
	
	

}
