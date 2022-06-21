package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Apiutils.CreatefakeApi1;

public class Verifyfakeputmethod extends CreatefakeApi1 {
     @Test
     
     public void Testfakeputmethod() throws FileNotFoundException {
    	 CreatefakeApi1 obj=new CreatefakeApi1();
    	 obj.fakeputmethod();
     }
}



