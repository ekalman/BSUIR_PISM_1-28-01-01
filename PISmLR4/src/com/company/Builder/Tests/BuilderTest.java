package com.company.Builder.Tests;

import com.company.Builder.BuilderOne;
import com.company.Builder.BuilderTwo;
import com.company.Builder.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {

    @Test
    public void testMain(){
        String[] args = {};
        Main.main(args);
        assertEquals(1,3);
    }
    @Test
    public void testBuilderOne(){
//    String expected_result = " may order a book. ";
    String expected_result = " can't order a book. ";
    BuilderOne builderOne = new BuilderOne();
    assertEquals(expected_result, builderOne.setMight());
    }
    @Test
    public void testBuilderTwo(){
//        String expected_result = " may supervise an order. ";
        String expected_result = " can't supervise an order. ";
        String result = "Access was given.";
        BuilderTwo builderTwo = new BuilderTwo();
        assertEquals(expected_result, builderTwo.setMight());
        assertEquals(result, builderTwo.getResult());
    }
}