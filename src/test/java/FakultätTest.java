import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakultätTest {

    @Test
    void shouldBe1(){
        int i = 1;
        int result = Fakultät.berechnung(i);
        assertEquals(1,result);
    }

    @Test
    void shouldBe2(){
        int i = 2;
        int result = Fakultät.berechnung(i);
        assertEquals(2,result);
    }

    @Test
    void shouldBe6(){
        int i = 3;
        int result = Fakultät.berechnung(i);
        assertEquals(6,result);
    }

    @Test
    void shouldBe24(){
        int i = 4;
        int result = Fakultät.berechnung(i);
        assertEquals(24,result);
    }

    @Test
    void shouldBe120(){
        int i = 5;
        int result = Fakultät.berechnung(i);
        assertEquals(120,result);
    }



}
