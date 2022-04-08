package Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listener implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) {
	Reporter.log("test case is started",true);
	ITestListener.super.onTestStart(result);
		}
	@Override
	public void onTestSuccess(ITestResult result) {
    Reporter.log("your test case is Passed",true);		
    ITestListener.super.onTestSuccess(result);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
    Reporter.log("your test case is Skipped,please check",true);		
	ITestListener.super.onTestSkipped(result);
	}
	@Override
	public void onTestFailure(ITestResult result) {
    Reporter.log("your test case is Failed,please check",true);		
	ITestListener.super.onTestFailure(result);
	}
	
}
