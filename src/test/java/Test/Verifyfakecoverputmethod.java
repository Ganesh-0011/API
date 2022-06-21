package Test;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Apiutils.CreatefakeApi1;
import Apiutils.CreatefakecoverApi1;

public class Verifyfakecoverputmethod  extends CreatefakecoverApi1{
	@Test
	public void Testfakecoverputmethod() throws FileNotFoundException  {
		   CreatefakecoverApi1 obj=new CreatefakecoverApi1();
		   obj.fakecoverputmethod();
	   }
	



}
