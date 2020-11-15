package IamLearningTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleTest {

    @Test
    public void multiple(){
        assertEquals(9, new SimpleCalculator().getMultiple(2,4));
    }
}