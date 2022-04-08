package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void method1()
  {
	  System.out.println("welcome to testng NG1");
  }
  @Test
  public void method2()
  {
	  System.out.println("welcome to testng NG2");
	  Reporter.log("welcome to testng NG2");

  }
}
