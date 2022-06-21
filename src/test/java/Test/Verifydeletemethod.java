package Test;

import org.testng.annotations.Test;

import Apiutils.CreateApi;

public class Verifydeletemethod extends CreateApi {
	@Test
	
	public void Testdeletemethod() {
		CreateApi obj=new CreateApi();
		obj.deletemethod();
	}

}
