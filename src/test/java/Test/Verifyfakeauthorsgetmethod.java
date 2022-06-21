package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Apiutils.CreatefakeauthorsApi;
import Apiutils.CreatefakeauthorsApi1;


public class Verifyfakeauthorsgetmethod  extends CreatefakeauthorsApi{
	@Test
	public void Testfakeauthorsgetmethod()  {
		   CreatefakeauthorsApi obj=new CreatefakeauthorsApi();
		   obj.fakeauthorsgetmethod();
	   
	
	}
	@Test
	public void Testfakeauthorsdeletemethod()  {
		   CreatefakeauthorsApi obj=new CreatefakeauthorsApi();
		   obj.fakeauthorsdeletemethod();
	   }
	@Test
	public void Testfakeauthorspostmethod() throws FileNotFoundException  {
		   CreatefakeauthorsApi1 obj=new CreatefakeauthorsApi1();
		   obj.fakeauthorspostmethod();
	   }


}




