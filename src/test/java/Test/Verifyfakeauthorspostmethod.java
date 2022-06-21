package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Apiutils.CreatefakeApi;
import Apiutils.CreatefakeauthorsApi;
import Apiutils.CreatefakeauthorsApi1;
import Apiutils.CreatefakecoverApi;

public class Verifyfakeauthorspostmethod  extends CreatefakeauthorsApi1{
	@Test
	public void Testfakeauthorspostmethod() throws FileNotFoundException  {
		   CreatefakeauthorsApi1 obj=new CreatefakeauthorsApi1();
		   obj.fakeauthorspostmethod();
	   }
	



}
