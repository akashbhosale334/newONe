package testng.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Annotationteststudy2 {
  @Test
   
  
  public void a()
  {
	  Reporter.log("Running A method", true);
  }
 
  @Test
  public void c()
  {
	  Reporter.log("Running C method", true);
  }
  @Test
  public void b()
  {
	  Reporter.log("Running B method", true);
  }
}
