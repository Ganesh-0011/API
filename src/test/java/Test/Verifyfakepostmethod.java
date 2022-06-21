package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Apiutils.CreatefakeApi1;

public class Verifyfakepostmethod extends CreatefakeApi1 {
     @Test
     
     public void Testfakepostmethod() throws FileNotFoundException {
    	 CreatefakeApi1 obj=new CreatefakeApi1();
    	 obj.fakepostmethod();
     }
}
