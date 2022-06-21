package Test;

import org.testng.annotations.Test;

import Apiutils.CreatefakeApi;

public class Verifyfakedeletemethod  extends CreatefakeApi {
	   @Test
	   
	   public void Testfakedeletemethod()  {
		   CreatefakeApi obj=new CreatefakeApi();
		   obj.fakedeletemethod();
	   }


}
