package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test(dependsOnMethods={"f1"})
  public void f() {
	Reporter.log("Test1");  
  
  }
  @Test
  public void f1() {
	Reporter.log("Test"); 
	System.out.println("addeddddd");
  
  }
}
