package pac2;

import org.testng.annotations.Test;

public class OrgTest {
@Test(groups="Regression")
public void createOrgTest() {	
	
	
	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	System.out.println("execute createORgTestregression1");
}
@Test(groups="Smoke")
public void modifyOrgTest() {
	System.out.println("execute smoke modifyOrgTest2");
}
}
