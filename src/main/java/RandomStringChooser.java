import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  private ArrayList<String> word;

  public RandomStringChooser(String[] wordArray) {
    word = new ArrayList<String>();
    for(int i = 0; i < wordArray.size(); i++) {
      word.add(wordArray.get(i));
    }
  }

  public String getNext() {
    if(word.size() == 0) {
      return "NONE";
    } else {
      int i = (int)(Math.random()*word.size());
      return word.remove(i);
    }
  }
}
