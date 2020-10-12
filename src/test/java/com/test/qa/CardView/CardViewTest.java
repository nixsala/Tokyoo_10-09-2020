package com.test.qa.CardView;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.PageBase;
import utils.TestBase;

public class CardViewTest extends TestBase {

    @Test(priority = 1)
    public static void fineAggregate() {
        SoftAssert softAssert = new SoftAssert();
        PageBase.staticWait(5);
        MasterMaterialTest.materialTest01();
        PageBase.staticWait(5);
        CardView.clickAggregate();
        PageBase.staticWait(8);
        CardView.BothCheckFineAggregate();
        CardView.clickreturncard();
    }
    @Test(priority = 2)
    public static void rCement() {
        SoftAssert softAssert = new SoftAssert();
        PageBase.staticWait(5);
        MasterMaterialTest.materialTest02();
        PageBase.staticWait(5);
        CardView.clickAggregate();
        PageBase.staticWait(8);
        CardView.BothCheckRcement();
        CardView.clickreturncard();
    }
    @Test(priority = 3)
    public static void admixture() {
        SoftAssert softAssert = new SoftAssert();
        PageBase.staticWait(5);
        MasterMaterialTest.materialTest03();
        PageBase.staticWait(5);
        CardView.clickAggregate();
        PageBase.staticWait(8);
        CardView.BothCheckAdmixture();
        CardView.clickreturncard();
    }
    @Test(priority = 4)
    public static void coarseAggregates() {
        SoftAssert softAssert = new SoftAssert();
        PageBase.staticWait(5);
        MasterMaterialTest.materialTest04();
        PageBase.staticWait(5);
        CardView.clickAggregate();
        PageBase.staticWait(8);
        CardView.BothCheckCoarseAggregate();
        CardView.clickreturncard();
    }
}
