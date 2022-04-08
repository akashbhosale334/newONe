package AssertsintestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertnotequalstudy {
  @Test
  public void Assertest() {
	  String name="akash";
	  String name1="akash";
	  
	  Assert.assertNotEquals(name1, name, "String are matchin");
  }
}
