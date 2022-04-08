package AssertsintestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertequalsStudy {
  @Test
  public void Asserttest()
  {
	  String name ="VCTC";
	  String name1="VCTC";
//	  if(name.equals(name1))
//	  {
//		  System.out.println("Tc i spassed");
//	  }
//	  else {
//		  {
//			  System.out.println("Tc is failed");
//		  }
//	}
	  Assert.assertEquals(name, name1);
  }
  
}
