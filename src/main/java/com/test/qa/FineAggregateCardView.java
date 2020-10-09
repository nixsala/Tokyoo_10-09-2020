package com.test.qa;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import utils.PageBase;

public class FineAggregateCardView extends PageBase {
    private static By cardAggregate= By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div[1]/div[1]/div/div/div[1]/h3/p");
    private static By VerifyFineAggregate = By.xpath(" /html/body/div[6]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[4]");
    private static By Cardview = By.xpath("/html/body/div/div/section/section/main/div/div[2]/div/div[1]/div[1]/div/div/div[1]/h3/p");
    public static void clickAggregate(){
        SoftAssert softAssert=new SoftAssert();
        getDriver().findElement(cardAggregate).click();

    }

}
