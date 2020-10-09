package com.test.qa;

import org.openqa.selenium.By;
import utils.PageBase;

public class LoginPage extends PageBase {
    private static By Username = By.id("usernameOrEmail");
    private static By Password = By.id("password");
    private static By btnlogin= By.xpath("//button");


    public static void setUsername(String username){
        getDriver().findElement(Username).sendKeys(username);
    }
    public static void setPassword(String password){
        getDriver().findElement(Password).sendKeys(password);
    }

    public static void clicklogin(){
        getDriver().findElement(btnlogin).click();
    }
}
