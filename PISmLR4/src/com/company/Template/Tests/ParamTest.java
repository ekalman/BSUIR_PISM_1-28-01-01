package com.company.Template.Tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import com.company.Template.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamTest {
    private int valueA;
    private int valueB;
    private int expected;

    public ParamTest(int valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters()
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
//                {1, 1, 2},
//                {2, 6, 8},
//                {18, 2, 20},
//                {13, 15, 28},
//                {1, 5, 6}
                {1, 1, 3},
                {2, 6, 9},
                {18, 2, 21},
                {13, 15, 29},
                {1, 5, 7}
        });

    }

    @Test
    public void paramTest() {
        assertEquals(expected, new Customer().calculateTimeOnPlatform(valueA,valueB));
    }
}