import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultätWhileTest {

    @Test
    void shouldBe1(){
        assertEquals(1,FakultätWhile.berechnung(1));
    }

    @Test
    void shouldBe2(){
        assertEquals(2,FakultätWhile.berechnung(2));
    }

    @Test
    void shouldBe6(){
        assertEquals(6, FakultätWhile.berechnung(3));
    }

    @Test
    void shouldBe24(){
        assertEquals(24, FakultätWhile.berechnung(4));
    }

    @Test
    void shouldBe120(){
        assertEquals(120, FakultätWhile.berechnung(5));
    }

    @Test
    void shouldBe720(){
        assertEquals(720, FakultätWhile.berechnung(6));
    }

}