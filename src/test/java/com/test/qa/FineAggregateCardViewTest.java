package com.test.qa;

import org.testng.annotations.Test;
import utils.PageBase;
import utils.TestBase;

public class FineAggregateCardViewTest extends TestBase {
    @Test
    public static void aggregate(){
        PageBase.staticWait(10);
        FineAggregateCardView.clickAggregate();
    }


    }
