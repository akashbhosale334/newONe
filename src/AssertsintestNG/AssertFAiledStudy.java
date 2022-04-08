package AssertsintestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFAiledStudy {
  @Test
  public void f() {
	  String c ="pune";
	  String b =null;
	  Assert.assertNotNull(c, "c is not null");
	  System.out.println("c ic not null");
	  Assert.assertNull(b, "null value");
	  System.out.println("b is a null value");
	  
	  Assert.fail();
  }
}
