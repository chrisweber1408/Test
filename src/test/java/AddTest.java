import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest{

    @Test
    void shouldAddTwoPositiveNumbers(){
        // given
        int number1= 11;
        int number2= 40;

        // when
        int result = Add.Adder.add(number1, number2);

        // then
        assertEquals(51, result);
    }

    @Test
    void shouldAddTwoNegativeNumbers(){
        // given
        int number1 = -54;
        int number2 = -12;

        // when
        int result = Add.Adder.add(number1, number2);

        // then
        assertEquals(-66, result);
    }

    @Test
    void shouldAddOneNegativeAndOnePositiveNumber(){
        // given
        int number1 = -5;
        int number2 = 15;

        // when
        int result = Add.Adder.add(number1, number2);

        // then
        assertEquals(10, result);

    }
}
