package Test;

import org.testng.annotations.Test;

import Apiutils.CreateApi;
import Apiutils.CreatefakeApi;

public class Verifyfakegetmethod  extends CreatefakeApi {
	   @Test
	   
	   public void Testfakegetmethod()  {
		   CreatefakeApi obj=new CreatefakeApi();
		   obj.fakegetmethod();
	   }
	}

	


