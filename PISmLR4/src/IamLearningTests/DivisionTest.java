package IamLearningTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    public void division(){
        assertEquals(9, new SimpleCalculator().getDivide(16,2));
    }
}
