import aptquiz1.*;

public class AptQuiz1 {
    public static void main(String[] args) throws Exception {
    // TotalLetterCount
    String[] words = new String[] {"owl", "tee", "ewe", "toe", "eel"};
    String letter = "e";

    TotalLetterCount tlc = new TotalLetterCount();
    System.out.println(tlc.total(words, letter));
    }
}
