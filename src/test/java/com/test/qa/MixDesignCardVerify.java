package com.test.qa;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.PageBase;
import utils.TestBase;

public class MixDesignCardVerify extends TestBase {
    @Test
    public static void cardTest(){
        SoftAssert softAssert=new SoftAssert();
        PageBase.staticWait(10);
        MixDesignAdd.clickMixDesign();
        MixDesignAdd.clickAddMixDesign();
        MixDesignAdd.clickVerifyFineAggregate();





    }

}
