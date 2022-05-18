import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToManyPeopleTest {

    @Test
    void shouldCheckRed(){

        String color = "rot";

        String a = ToManyPeople.ToMany(color);

        Assertions.assertEquals("keine Personen erlaubt", a);
    }
    @Test
    void shouldCheckYellow(){
        String color = "gelb";

        String a = ToManyPeople.ToMany(color);

        Assertions.assertEquals("30 Personen erlaubt", a);
    }

    @Test
    void shoouldCheckGreen(){
        String color = "grün";

        String a = ToManyPeople.ToMany(color);

        Assertions.assertEquals("60 Personen erlaubt", a);
    }

}
