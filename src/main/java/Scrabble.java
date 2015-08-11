import java.util.*;
import java.io.Console;

public class Scrabble {
  public static void main(String[] args) {}

      public static Integer scrabbleScore(String userInput)
      {
      //Console myConsole = System.console();
      //System.out.println("Enter any word");

      //String userInput = myConsole.readLine();
      String convertedInput = userInput.toLowerCase();
      String[] characters = convertedInput.split("");

      HashMap<String, Integer> lettersMap = new HashMap<String, Integer>();

      lettersMap.put("a", 1);
      lettersMap.put("e", 1);
      lettersMap.put("i", 1);
      lettersMap.put("o", 1);
      lettersMap.put("u", 1);
      lettersMap.put("l", 1);
      lettersMap.put("n", 1);
      lettersMap.put("r", 1);
      lettersMap.put("s", 1);
      lettersMap.put("t", 1);
      lettersMap.put("d", 2);
      lettersMap.put("g", 2);
      lettersMap.put("b", 3);
      lettersMap.put("c", 3);
      lettersMap.put("m", 3);
      lettersMap.put("p", 3);
      lettersMap.put("f", 4);
      lettersMap.put("h", 4);
      lettersMap.put("v", 4);
      lettersMap.put("w", 4);
      lettersMap.put("y", 4);
      lettersMap.put("k", 5);
      lettersMap.put("j", 8);
      lettersMap.put("x", 8);
      lettersMap.put("q", 10);
      lettersMap.put("z", 10);


      Integer sum = 0;

      // ["H", "e", "l", "l", "o"]

      for (String letter : characters) {
          //userInput.toLowerCase();
          Integer letterValue = lettersMap.get(letter);
          sum = sum + letterValue;
      }
      return sum;
    }

  }
