package Test;
  
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Apiutils.CreateApi;
import Apiutils.CreateApi1;


public class Verifygetmethod  extends CreateApi {
   @Test(priority=2)
   
   public void Testgetmethod()  {
	   CreateApi obj=new CreateApi();
	   obj.getmethod();
   }
   @Test
   public void Testpostmethod() throws FileNotFoundException {
  	 CreateApi1 obj=new CreateApi1();
  	 obj.postmethod();
  	            
   }
   @Test(priority=1)
   
   public void Testputmethod() throws FileNotFoundException {
  	 CreateApi1 obj=new CreateApi1();
  	 obj.putmethod();
   }
   @Test(priority=3)
   public void Testpatchmethod() throws FileNotFoundException {
  	 CreateApi1 obj=new CreateApi1();
  	 obj.patchmethod();
  	            
   }

}
  