package com.test.qa.CardView;

import com.test.qa.CardView.MasterMaterial;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.PageBase;
import utils.TestBase;

public class MasterMaterialTest extends TestBase {

    @Test(priority = 01)
    public static void materialTest01() {
        SoftAssert softAssert = new SoftAssert();
        PageBase.staticWait(10);
        MasterMaterial.clickClickMaster();
        MasterMaterial.clickClickMaterialNV();
        MasterMaterial.clickClickMaterialFIled();
        MasterMaterial.clickFilterMaterial();
        PageBase.staticWait(10);
        MasterMaterial.sendvalueFilterMaterial("Fine Aggregates");
        MasterMaterial.clickClickSearchbutton();
        MasterMaterial.clickHome();
    }
        @Test(priority = 02)
        public static void materialTest02(){
            SoftAssert softAssert=new SoftAssert();
            PageBase.staticWait(10);
            MasterMaterial.clickClickMaster();
            MasterMaterial.clickClickMaterialNV();
            MasterMaterial.clickClickMaterialFIled();
            MasterMaterial.clickFilterMaterial();
            PageBase.staticWait(10);
            MasterMaterial.sendvalueFilterMaterial("R-Cement");
            MasterMaterial.clickClickSearchbutton();
            MasterMaterial.clickHome();
    }
    @Test(priority = 03)
    public static void materialTest03(){
        SoftAssert softAssert=new SoftAssert();
        PageBase.staticWait(10);
        MasterMaterial.clickClickMaster();
        MasterMaterial.clickClickMaterialNV();
        MasterMaterial.clickClickMaterialFIled();
        MasterMaterial.clickFilterMaterial();
        PageBase.staticWait(10);
        MasterMaterial.sendvalueFilterMaterial("Admixture");
        MasterMaterial.clickClickSearchbutton();
        MasterMaterial.clickHome();
    }
    @Test(priority = 04)
    public static void materialTest04(){
        SoftAssert softAssert=new SoftAssert();
        PageBase.staticWait(10);
        MasterMaterial.clickClickMaster();
        MasterMaterial.clickClickMaterialNV();
        MasterMaterial.clickClickMaterialFIled();
        MasterMaterial.clickFilterMaterial();
        PageBase.staticWait(10);
        MasterMaterial.sendvalueFilterMaterial("Coarse Aggregates");
        MasterMaterial.clickClickSearchbutton();
        MasterMaterial.clickHome();

    }
}
