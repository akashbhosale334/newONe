package AssertsintestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfalsestudy {
  @Test
  public void Testing() {
	  boolean result=false;
	  
	  Assert.assertFalse(result, "result is true");
  }
}
