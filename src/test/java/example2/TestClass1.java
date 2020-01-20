/*
 * XP.RAVEN Project
 * <p/>
 * Copyright (C) 2018 Xpand IT.
 * <p/>
 * This software is proprietary.
 */
package example2;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestClass1 {

    @Test(groups="myGroup")
    public void t1() {
        Assert.assertTrue(false);
    }

    @Test(groups="myGroup")
    public void t2() {
        try {
            sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(false);
    }

    @Test(groups="myGroup123432")
    public void t3() {
    }

    @Test
    public void t44() {
        throw new SkipException("skip exception");
    }

    @Test(dataProvider="dp")
    public void t5(String param) {
    }

    @DataProvider
    private Object[][] dp() {
        return new Object[][]{{"one"}, {"two"}};
    }
}