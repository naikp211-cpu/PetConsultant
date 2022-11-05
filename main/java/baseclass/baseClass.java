package baseclass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test
public class baseClass {
@BeforeSuite
public void configureBeforeSuite()
{
	System.out.println("connect to database");
	
}
@BeforeTest
public void configureBeforeTest()
{
	System.out.println("execute the script in the parallel mode");
}
@BeforeClass
public void configureBeforeClass()
{
	System.out.println("launch the browser");
}
@BeforeMethod
public void configureBeforeMethod()
{
	System.out.println("login to the applicaation");
}
@AfterMethod
public void configureAfterMethod()
{
System.out.println("logout the application");

}
@AfterClass
public void configureAfterClass()
{
System.out.println("Close the application");
}
@AfterSuite
public void configureAfterSuite()
{
	System.out.println("close database connection");
}
}