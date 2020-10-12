package com.test.qa.CardView;

import org.openqa.selenium.By;
import org.testng.log4testng.Logger;
import utils.PageBase;

public class CardView extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(((CardView.class)));

    private static By cardAggregate = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div[1]/div[1]/div/div/div[1]/h3/p");
    private static By VerifyManucatureSand = By.xpath("//*[contains(text(),'Manufactured Sand')]");
    private static By CardviewManufacture = By.xpath("//*[contains(text(),'Manufactured Sand')]");

    private static By cardRcement = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div[1]/div[2]/div/div/div[2]");
    private static By VerifyRcement = By.xpath("//*[contains(text(),'BHC_Cement')]");
    private static By CardviewRcement = By.xpath("//*[contains(text(),'Manufactured Sand')]");

    private static By cardAdmixture = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div[1]/div[3]/div/div/div[2]");
    private static By VerifyAdmixture = By.xpath("//*[contains(text(),'Optima100')]");
    private static By VerifyAdmixture1 = By.xpath("//*[contains(text(),'Optima-270')]");
    private static By CardviewAdmixture = By.xpath("//*[contains(text(),'Manufactured Sand')]");

    private static By cardCoarseAggregates = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div[1]/div[4]/div/div/div[2]");
    private static By VerifyCoarseAggregate = By.xpath("//*[contains(text(),'0-5mm')]");
    private static By CardviewCoarseAggregate = By.xpath("//*[contains(text(),'Manufactured Sand')]");

    private static By returncardclick = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div[4]/div/div");

    public static void clickAggregate() {
        getDriver().findElement(cardAggregate).click();

    }

    public static void clickreturncard() {
        getDriver().findElement(returncardclick).click();
    }

    public static void clickcardRcement() {
        getDriver().findElement(cardRcement).click();
    }

    public static void clickcardAdmixture() {
        getDriver().findElement(cardAdmixture).click();
    }

    public static void clickcardCourseAggregates() {
        getDriver().findElement(cardCoarseAggregates).click();
    }

    public static void BothCheckFineAggregate() {
        getDriver().findElement(VerifyManucatureSand).getText();
        getDriver().findElement(CardviewManufacture).getText();

        if ((VerifyManucatureSand).equals(CardviewManufacture)) {
            LOGGER.info("Both are same");
            System.out.println("Both are same");
        } else {
            LOGGER.info("not same ");
        }
    }

    public static void BothCheckRcement() {
        getDriver().findElement(VerifyRcement).getText();
        getDriver().findElement(CardviewRcement).getText();

        if ((VerifyRcement).equals(CardviewRcement)) {
            LOGGER.info("Both are same");
            System.out.println("Both are same");
        } else {
            LOGGER.info("not same ");
        }
    }
    public static void BothCheckAdmixture() {
        getDriver().findElement(VerifyAdmixture).getText();
        getDriver().findElement(CardviewAdmixture).getText();

        if ((VerifyAdmixture).equals(CardviewAdmixture)) {
            LOGGER.info("Both are same");
            System.out.println("Both are same");
        } else {
            LOGGER.info("not same ");
        }
    }
    public static void BothCheckCoarseAggregate() {
        getDriver().findElement(VerifyCoarseAggregate).getText();
        getDriver().findElement(CardviewCoarseAggregate).getText();

        if ((VerifyCoarseAggregate).equals(CardviewCoarseAggregate)) {
            LOGGER.info("Both are same");
            System.out.println("Both are same");
        } else {
            LOGGER.info("not same ");
        }
    }
}

