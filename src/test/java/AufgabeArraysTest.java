import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AufgabeArraysTest {


    @Test
    void shouldBeOneStudents(){
        String[] expected = {"Student: 1"};
        assertArrayEquals(expected, AufgabeArrays.addStudents(1));
    }

    @Test
    void shouldBeTwoStudents(){
        String[] expected = {"Student: 1", "Student: 2"};
        assertArrayEquals(expected, AufgabeArrays.addStudents(2));
    }

    @Test
    void shouldBeThreeStudents(){
        String[] expected = {"Student: 1", "Student: 2", "Student: 3"};
        assertArrayEquals(expected, AufgabeArrays.addStudents(3));
    }

}