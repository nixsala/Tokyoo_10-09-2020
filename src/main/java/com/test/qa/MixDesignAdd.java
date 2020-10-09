package com.test.qa;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import utils.PageBase;

public class MixDesignAdd extends PageBase {
    private static By ClickMixDesign = By.xpath("/html/body/div/div/section/section/main/div/div[1]/div[2]/a[3]/div/div");
    private static By ClickAddMixDesign = By.xpath("/html/body/div[1]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[1]/div/div[3]/button");
    private static By VerifyFineAggregate = By.xpath(" /html/body/div[6]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[4]");
    private static By Cardview = By.xpath("/html/body/div/div/section/section/main/div/div[2]/div/div[1]/div[1]/div/div/div[1]/h3/p");

    public static void clickMixDesign(){
        getDriver().findElement(ClickMixDesign).click();

    }
    public static void clickAddMixDesign(){
        getDriver().findElement(ClickAddMixDesign).click();

    }

    public static void clickVerifyFineAggregate(){
        SoftAssert softAssert=new SoftAssert();
        getDriver().findElement(VerifyFineAggregate).getText();
        getDriver().findElement(Cardview).getText();
        softAssert.assertSame(VerifyFineAggregate,Cardview,"Both ARE SAME");

    }



}
