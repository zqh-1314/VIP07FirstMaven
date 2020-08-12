package com.testing.class8;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecursionTestTest {

    RecursionTest rt=new RecursionTest();

    @Test
    public void jiecheng() {
        assertEquals(RecursionTest.jiecheng(-1),120);
    }

    @Test
    public void phib() {
        assertEquals(377,rt.phib(15));
    }

    @Test
    public void phibArray() {
        assertEquals(64,rt.phibArray(10));
    }
}