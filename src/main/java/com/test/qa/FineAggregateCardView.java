package com.test.qa;

import org.openqa.selenium.By;
import utils.PageBase;

public class FineAggregateCardView extends PageBase {
    private static By cardAggregate= By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div[1]/div[1]/div/div/div[1]/h3/p");


    public static void clickAggregate(){
        getDriver().findElement(cardAggregate).click();
    }


}
