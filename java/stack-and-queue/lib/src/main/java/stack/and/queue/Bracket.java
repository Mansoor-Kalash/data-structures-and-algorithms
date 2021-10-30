package stack.and.queue;

public class Bracket {

  public static boolean validateBrackets (String text){

    int openRoundBrackets=0;
    int closeRoundBrackets=0;
    int openSquareBrackets=0;
    int closeSquareBrackets=0;
    int openCurlyBrackets=0;
    int closeCurlyBrackets=0;


    for(char charecter : text.toCharArray()){
//String c = String.valueOf(charecter);
switch (charecter) {
  case '(':
    openRoundBrackets += 1;
    break;
  case ')':closeRoundBrackets+=1;
  break;
  case '[':openSquareBrackets+=1;
  break;
  case ']':closeSquareBrackets+=1;
  break;
  case '{':openCurlyBrackets+=1;
  break;
  case '}':closeCurlyBrackets+=1;
  break;
}
    }
    return openCurlyBrackets == closeCurlyBrackets && openRoundBrackets == closeRoundBrackets && openSquareBrackets == closeSquareBrackets;

  }
}
