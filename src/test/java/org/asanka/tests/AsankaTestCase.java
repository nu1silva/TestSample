package org.asanka.tests;

import org.testng.annotations.*;

/**
 * Created by asankav on 3/23/16.
 */
public class AsankaTestCase {

    @Test(groups = "wso2.as",description = "ddd")
    public void autoTest1(){
        assert (false);
    }

    @Test
    public void autoTest2(){
        assert (true);
    }
}
