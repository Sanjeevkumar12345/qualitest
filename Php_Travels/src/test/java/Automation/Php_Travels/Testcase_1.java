package Automation.Php_Travels;

import org.testng.annotations.Test;

public class Testcase_1 {
	@Test
	public void Reg() throws Exception {
		homepage h= new homepage();
		h.Launchbrowser();
		h.Signup();
		Regitration r= new Regitration();
		r.Register();
	}
	
	
}
