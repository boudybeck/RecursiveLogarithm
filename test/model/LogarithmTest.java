package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LogarithmTest {

    @Test
    void getIntLogarithm() {
        int expected = 4
                , actual = Logarithm.getIntLogarithm(2,25);
        assertEquals(expected, actual);
    }
}