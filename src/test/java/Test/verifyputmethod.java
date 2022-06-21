package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Apiutils.CreateApi1;


public class verifyputmethod   extends CreateApi1 {
     @Test
     
     public void Testputmethod() throws FileNotFoundException {
    	 CreateApi1 obj=new CreateApi1();
    	 obj.putmethod();
     }
}
