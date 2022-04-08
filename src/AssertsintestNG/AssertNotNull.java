package AssertsintestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void Testing() {
	  
	  String b="Akshay";
	  Assert.assertNotNull(b, "b is not Null");
  }
}
