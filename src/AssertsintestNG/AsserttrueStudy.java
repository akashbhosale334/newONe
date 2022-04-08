package AssertsintestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserttrueStudy {
  @Test
  public void Testing() {
	  
	  boolean result=true;
	 Assert.assertTrue(result, "Result is false");
  }
}
