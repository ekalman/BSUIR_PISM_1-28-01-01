package IamLearningTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    public void sum(){
        assertEquals(3, new SimpleCalculator().getSum(1,1));
    }

}