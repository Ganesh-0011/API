package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Apiutils.CreatefakeauthorsApi1;
public class Verifyfakeauthorsputmethod  extends CreatefakeauthorsApi1{
	@Test
	public void Testfakeauthorsgetmethod() throws FileNotFoundException  {
		   CreatefakeauthorsApi1 obj=new CreatefakeauthorsApi1();
		   obj.fakeauthorsputmethod();
	   }
	



}
