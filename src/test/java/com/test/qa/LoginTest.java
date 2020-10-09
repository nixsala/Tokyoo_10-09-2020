package com.test.qa;


import org.testng.annotations.Test;
import utils.TestBase;

public class LoginTest extends TestBase {

    @Test
    public static void login(){
        LoginPage.setUsername("admin");
        LoginPage.setPassword("admin");
        LoginPage.clicklogin();
    }
}
