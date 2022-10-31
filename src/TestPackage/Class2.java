package TestPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Class2 {

	@Test
	public void First() {
		System.out.println("Second Class");
	}
	
	@Test(groups= {"Smoke"})
	public void Class2Testday3() {
		System.out.println("day3");
	}
	
	@BeforeTest 
	public void login() {
		System.out.println("BeforeTest");
	}
	
	@BeforeSuite
	public void SuiteStart() {
		System.out.println("Suite Start Here");
	}
	
	@AfterTest(timeOut=4000)
	public void Logout() {
		System.out.println("After Test");
	}
	
	@Test(enabled=false)
	public void LaunchChrome() {
		System.out.println("ChormeLaunch");
	}
	
	@Test(dependsOnMethods = {"LaunchChrome"})
	public void HitUrl() {
		System.out.println("Url entered");
	}
	
	@BeforeMethod
	public void BeforeEvery() {
		System.out.println("Before Every Method in Class2");
	}
	
	
}
