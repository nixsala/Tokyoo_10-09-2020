package com.test.qa;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.PageBase;
import utils.TestBase;


public class FineAggregateCardViewTest extends TestBase {
    @Test(priority = 2)
    public static void aggregate(){
        SoftAssert softAssert=new SoftAssert();
        PageBase.staticWait(10);
        FineAggregateCardView.clickAggregate();




    }

    @Test(priority=1)
    public static void cardTest(){
        SoftAssert softAssert=new SoftAssert();
        PageBase.staticWait(10);
        MixDesignAdd.clickMixDesign();
        MixDesignAdd.clickAddMixDesign();
        MixDesignAdd.clickVerifyFineAggregate();





    }


    }
