package Test;
import org.testng.annotations.Test;

import Apiutils.CreatefakeApi;
import Apiutils.CreatefakecoverApi;

public class Verifyfakecoverdeletemethod  extends CreatefakecoverApi{
	@Test
	public void Testfakecoverdeletemethod()  {
		   CreatefakecoverApi obj=new CreatefakecoverApi();
		   obj.fakecoverdeletemethod();
	   }
	


}
