package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Apiutils.CreateApi1;
public class verifypostmethod extends CreateApi1 {
     @Test
     public void Testpostmethod() throws FileNotFoundException {
    	 CreateApi1 obj=new CreateApi1();
    	 obj.postmethod();
    	            
     }
}
