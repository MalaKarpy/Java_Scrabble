import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;

public class ScrabbleTest {


@Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
    Scrabble app = new Scrabble();
    Integer sum = 1;
    assertEquals(sum, app.scrabbleScore("a"));
  }

  @Test
    public void scrabbleScore_returnsAScrabbleScoreForALetter_2() {
      Scrabble app = new Scrabble();
      Integer sum = 2;
      assertEquals(sum, app.scrabbleScore("as"));
    }

    @Test
      public void scrabbleScore_returnsAScrabbleScoreForALetter_3() {
        Scrabble app = new Scrabble();
        Integer sum = 10;
        assertEquals(sum, app.scrabbleScore("Q"));
      }
      @Test
        public void scrabbleScore_returnsAScrabbleScoreForALetter_4() {
          Scrabble app = new Scrabble();
          Integer sum = 9;
          assertEquals(sum, app.scrabbleScore("KING"));
        }

}
