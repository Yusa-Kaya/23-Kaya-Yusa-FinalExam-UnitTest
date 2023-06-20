import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {
    private StringCalculator stringCalculator;

    @BeforeEach
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        stringCalculator = null;
    }

    //Throw exception if negative number has been added.
    @Test
    public void test1(){
        assertThrows(IllegalArgumentException.class, () -> {
            stringCalculator.add("-1, 6");});
    }

    //Test if numbers bigger than 1000 ignored
    @Test
    public void test2(){
        int expected = 1;
        int actual = stringCalculator.add("1, 1000");
        assertEquals(expected, actual);
    }
}
