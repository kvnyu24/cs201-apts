package apt2;
import java.util.*; 

public class SimpleWordGame {
    public int points(String[] player, 
                      String[] dictionary) {
        int score = 0;
        Set<String> playerSet = new HashSet<>(Arrays.asList(player));

        for (String word: playerSet) {
            if (Arrays.stream(dictionary)
            .anyMatch(x -> word.equals(x))) {
                score += word.length() * word.length();
            }
        }

        return score;
    }
}