package TestPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// add test NG in eclipse first
//Go to help then Eclipse MArketplace -> and search TestNG and install
// once its is installed verify its installed successfully - go to Window->preferences-> search for Testng if its there then its perfectly insatlled 
// Convert Class file to TestNG XML- Select Project in Eclipse->TestNG->Convert to TestNG
// XML format- Test Suite-> Test Folder->Test Cases
// include class
// exlclude individual method from class

// Difference between BeforeTest & BeforeMethod - Before test execute always before test suite (as per xml) and BeforeTest execute always before every test 

// Class level annotation -  BeforeClass & BeforeMethod
// TestNG XML level annotation - BeforeTest & BeforeSuite

// Note - Test NG executes Test by Default in Alphabetical order here - Atest2 will be first then Btest1

// DependsOnMethod - if one method depends on other method then we need to use this
// @Test(enabled="false") of dont want to execute any test case 
// PArameter -  XML level and Test level 
	// if we define within <test> tag then scope will be till test only

// exeucte same method with multiple data - @DataProvider
// ITestListener Intreface- need to implement to 
// To run aprallel in multiple browser - parallel="tests" thread-count="2" add in suite
public class Basics {

	@BeforeClass
	public void BeforeClassMethod() {
		System.out.println("Before Class");
	}
	
	@Parameters({"URL","Username"}) // passing as parameter 
	@Test(groups= {"Smoke"})
	public void Btest1(String urls,String username) {
		System.out.println("welcome");
		System.out.println(urls);
		System.out.println(username);
	}

	@Test(groups= {"Smoke"})
	public void Atest2() {
		System.out.println("Bye");
	}
	
	@AfterSuite
	public void Suitelast() {
		System.out.println("Suite End here");
	}
	
	// Pass Data Provider name here to iterate 2 times same method 
	
	@Test(dataProvider ="GetData")
	public void LoginApp(String username, String pwd) {
		System.out.println("Github addition");
		System.out.println("Github addition2");
		System.out.println(username +"--And--"+ pwd);
	}
	
	@DataProvider
	public Object[][] GetData() {
		
		Object[][] data = new Object[2][2];
		
		//first data
		data[0][0] = "Firstusername";
		data[0][1] = "FirstPassword";
		
		//2nd data
		data[1][0] = "Second Username";
		data[1][1] = "second passowrd";
		
		return data;
	}
}
