package hashmap.repeated.word;

import java.util.HashSet;
import java.util.Locale;

public class HashmapRepeatedWord {
  public static String repeatedWord(String words) {

    String[] wordsArray = words.split("\\W+");
    HashSet hashSet = new HashSet();

    for (String word :  wordsArray) {
      if (hashSet.contains(word.toLowerCase())) {
        return word;
      } else {
        hashSet.add(word.toLowerCase());
      }
    }
    return null;
  }
}
