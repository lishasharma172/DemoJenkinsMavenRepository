package pac1;

import org.testng.annotations.Test;

public class ContactTest{
@Test(groups="Regression")
public void createContactTest () {
	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	
	System.out.println("execute Regression contact1");
}
@Test(groups="Smoke")
public void modifyContactTest() {
	System.out.println("execute smoke modifyContactTest1");
	System.out.println("execute smoke modifyContactTest2");
	System.out.println("smoke modifyContactTest3");
}
}
