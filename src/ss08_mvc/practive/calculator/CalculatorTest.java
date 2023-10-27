package ss08_mvc.practive.calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    @Test
    @DisplayName("Testing addtion")
    void testCalculateAdd(){
        int fistOperand = 1;
        int secondOperand = 1;
        char ADDTION = '+';
        int expected = 2;

        int result = Calculator.calculate(fistOperand, secondOperand, ADDTION);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul(){
        int fistOperand = 2;
        int secondOperand = 2;
        char MULTIPLICATION = '*';
        int expected = 4;

        int result = Calculator.calculate(fistOperand, secondOperand, MULTIPLICATION);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing division")
    void testCalculateDiv(){
        int fistOperand = 6;
        int secondOperand = 3;
        char DIVISION = '/';
        int expected = 2;

        int result = Calculator.calculate(fistOperand, secondOperand, DIVISION);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero(){
        int fistOperand = 2;
        int secondOperand = 1;
        char DIVISION = '/';

        assertThrows(RuntimeException.class,
                ()->{Calculator.calculate(fistOperand,secondOperand,DIVISION);});
    }
    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator(){
        int fistOperand = 2;
        int secondOperand = 0;
        char EQUAL = '=';

        assertThrows(RuntimeException.class,
                ()->{Calculator.calculate(fistOperand,secondOperand,EQUAL);});
    }
}

