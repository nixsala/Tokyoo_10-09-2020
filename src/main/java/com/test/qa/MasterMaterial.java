package com.test.qa;

import org.openqa.selenium.By;
import utils.PageBase;

public class MasterMaterial extends PageBase {

    private static By ClickMaster= By.xpath("/html/body/div[1]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By ClickMaterialNV = By.xpath("/html/body/div[1]/div/section/section/header/ul/ul/li[8]/a");
    private static By ClickMaterialFIled = By.xpath("/html/body/div[1]/div/section/section/main/div/div[1]/div[4]");
    private static By FilterMaterial = By.xpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/div[1]/table/thead/tr/th[3]/span[2]");
    private static By ClickSearchbutton = By.xpath("/html/body/div[4]/div/div/div/div/div/button[1]");
    private static By SubcategoryFilter = By.xpath("/html/body/div[4]/div/div/div/div/input");




    public static void clickClickMaster(){
        getDriver().findElement(ClickMaster).click();

    }
    public static void clickClickMaterialNV(){
        getDriver().findElement(ClickMaterialNV).click();

    }
    public static void clickClickMaterialFIled(){
        getDriver().findElement(ClickMaterialFIled).click();

    }


    public static void clickFilterMaterial(){
        getDriver().findElement(FilterMaterial).click();

    }

    public static void sendvalueFilterMaterial(String subcategory){
        getDriver().findElement(SubcategoryFilter).sendKeys(subcategory);

    }
    public static void clickClickSearchbutton(){
        getDriver().findElement(ClickSearchbutton).click();

    }


}
