import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultätReKursionTest {

    @Test
    void shouldBe1(){
        assertEquals(1, FakultätReKursion.berechnung(1));
    }

    @Test
    void shouldBe2(){
        assertEquals(2, FakultätReKursion.berechnung(2));
    }

    @Test
    void shouldBe6(){
        assertEquals(6, FakultätReKursion.berechnung(3));
    }

    @Test
    void shouldBe24(){
        assertEquals(24, FakultätReKursion.berechnung(4));
    }

    @Test
    void shouldBe120(){
        assertEquals(120, FakultätReKursion.berechnung(5));
    }

}