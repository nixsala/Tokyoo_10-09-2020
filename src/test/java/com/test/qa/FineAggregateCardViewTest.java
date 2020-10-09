package com.test.qa;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.PageBase;
import utils.TestBase;


public class FineAggregateCardViewTest extends TestBase {
    @Test(priority = 1)
    public static void aggregate(){
        SoftAssert softAssert=new SoftAssert();
        PageBase.staticWait(10);
        MasterMaterialTest.materialTest();
        FineAggregateCardView.clickAggregate();
        PageBase.staticWait(8);
        FineAggregateCardView.clickreturncard();

    }
    }

