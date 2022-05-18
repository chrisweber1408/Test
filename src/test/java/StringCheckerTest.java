import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCheckerTest {

    @Test
    void shouldCheckIfStringIsSmalerThen20LettersAndNoFancy(){
        // given
        String a = "Hi wie geths fancy??";

        // when
        boolean small = StringChecker.checkString(a);

        // then
        Assertions.assertFalse(small);
    }

    @Test
    void shouldCheckIfStringIsBiggerThen20LettersButNoFancy(){
        // given
        String a = "Hi wie geht es dir heut an so einem schönen Tag?";

        // when
        boolean big = StringChecker.checkString(a);

        // then
        Assertions.assertFalse(big);
    }

    @Test
    void shouldCheckIfStringIsBiggerThen20LettersAndGotFancy(){
        // given
        String a = "Hi wie geht es dir heute an so einem fancy Tag?";

        // when
        boolean fancy = StringChecker.checkString(a);

        // then
        Assertions.assertTrue(fancy);
    }

}
