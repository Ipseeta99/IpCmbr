package com.test1;

import org.testng.annotations.Test;


public class demo2_TestNG {
  @Test(priority=2)
  public void login() {
	  System.out.println("this is login method");
	  
  }
  
  @Test(priority=1,enabled=false)
  public void register() {
	  System.out.println("this is register method");
  }
  
  @Test(priority=3)
  public void logout() {
	  System.out.println("this is logout method");
  }
}
