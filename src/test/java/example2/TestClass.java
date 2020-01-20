/*
 * XP.RAVEN Project
 * <p/>
 * Copyright (C) 2018 Xpand IT.
 * <p/>
 * This software is proprietary.
 */
package example2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

public class TestClass {

    @Parameters(value="Requirement")
    @Tag(name="qwe")
    @Test(groups="XTP-123")
    public void t1(String desc) {
        System.out.println("Requirement: " + desc);
    }

    @Parameters("Test")
    @Test(groups="XTP-123")
    public void t2(String desc) {
        System.out.println("Test: " + desc);
    }
}
