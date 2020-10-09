package com.test.qa;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.PageBase;
import utils.TestBase;

public class MasterMaterialTest extends TestBase {

    @Test
    public static void materialTest(){
        SoftAssert softAssert=new SoftAssert();
        PageBase.staticWait(10);
       MasterMaterial.clickClickMaster();
       MasterMaterial.clickClickMaterialNV();
       MasterMaterial.clickClickMaterialFIled();
       MasterMaterial.clickFilterMaterial();
        PageBase.staticWait(10);
       MasterMaterial.sendvalueFilterMaterial("Fine Aggregates");
       MasterMaterial.clickClickSearchbutton();





    }
}
