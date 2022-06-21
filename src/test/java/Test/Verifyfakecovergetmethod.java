package Test;

import org.testng.annotations.Test;

import Apiutils.CreatefakeApi;
import Apiutils.CreatefakecoverApi;

public class Verifyfakecovergetmethod  extends CreatefakecoverApi{
	@Test
	public void Testfakecovergetmethod()  {
		   CreatefakecoverApi obj=new CreatefakecoverApi();
		   obj.fakecovergetmethod();
	   }
	

}
