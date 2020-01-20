/*
 * XP.RAVEN Project
 * <p/>
 * Copyright (C) 2018 Xpand IT.
 * <p/>
 * This software is proprietary.
 */
package example1;

import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

public class TestNgMavenExampleTest {

    @Test
    @Tag(name = "XRAY-12345")
    public void thisIsTheMethodName() {
        System.out.println("This is TestNG-Maven Example");
    }
}