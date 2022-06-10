package Listners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Test_Base.Base_class;

public class ItestLisnter extends Base_class implements ITestListener {


	
	
public ItestLisnter() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	
	}
	@Override
	public void onTestFailure(ITestResult result) {
		onTestfailure(result.getMethod().getMethodName());
		
	}




	

}
