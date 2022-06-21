package Test;

import org.testng.annotations.Test;

import Apiutils.CreatefakeApi;
import Apiutils.CreatefakeauthorsApi;
import Apiutils.CreatefakecoverApi;

public class Verifyfakeauthorsdeletemethod  extends CreatefakeauthorsApi{
	@Test
	public void Testfakeauthorsdeletemethod()  {
		   CreatefakeauthorsApi obj=new CreatefakeauthorsApi();
		   obj.fakeauthorsdeletemethod();
	   }

}
