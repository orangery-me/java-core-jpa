import java.util.ArrayList;
import java.util.Scanner;

public class Words {
  public static void main(String[] args) {

      ArrayList<String> words = new ArrayList<String>();

      Scanner input = new Scanner(System.in);

      String word = "";
      //Ask the user for 10 words
      System.out.println("Please input 5 words");
      for(int i=1; i<=5; i++ ) {
        word = input.next();
        words.add(word);
      }

      //Print the list and it size
      System.out.println(words);
      System.out.println(words.size());
      
      //Hint: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#size--

      //Ask the user for 1 letter
      System.out.println("Please input a letter");
      Character letter;
      // Scanner input_letter= new Scanner(System.in);
      letter= input.next().charAt(0);

      for (int i=0; i<words.size(); ++i){
        if (words.get(i).charAt(0) == letter){
          words.remove(i);
        }
      }

      System.out.println(words);
      System.out.println(words.size());

      //Remove from list all the words that start with that letter
      //Hint: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#remove-java.lang.Object-


      //Print the List again and it size
  }
}
