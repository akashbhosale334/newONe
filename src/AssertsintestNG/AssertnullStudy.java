package AssertsintestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertnullStudy {
  @Test
  public void testing() {
	  String a =null;
	  Assert.assertNull(a, "a is not null");
	  System.out.println("hi all hoew are you");
  }
}
