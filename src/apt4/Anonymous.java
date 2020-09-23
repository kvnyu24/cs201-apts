package apt4;
import java.util.*;
import java.lang.String.*;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        int count = 0;
        HashMap<String, Integer> letterCount = new HashMap<>(); 
        for (String str: headlines) {
            str = str.toLowerCase();
            String[] letters = str.replaceAll("\\s", "").split("");
            for (String letter: letters) {
                if (!letterCount.containsKey(letter)) {
                    letterCount.put(letter, 1);
                } else {
                    letterCount.put(letter, letterCount.get(letter) + 1);
                }
            }
        }

        for (String msg: messages) {
            HashMap<String, Integer> msgLetterCount = new HashMap<>(); 
            msg = msg.toLowerCase();
            String[] msgLetters = msg.replaceAll("\\s", "").split("");
            boolean canWrite = true;

            for (String letter: msgLetters) {
                if (!msgLetterCount.containsKey(letter)) {
                    msgLetterCount.put(letter, 1);
                } else {
                    msgLetterCount.put(letter, msgLetterCount.get(letter) + 1);
                }
            }

            for (String key: msgLetterCount.keySet()) {
                if (letterCount.get(key) != null) {
                    if (msgLetterCount.get(key) > letterCount.get(key)) {
                        canWrite = false;
                    }
                } 
                else if (letterCount.get(key) == null) {
                    canWrite = false;
                }
            }

            if (canWrite){
                System.out.println(msg);
                count += 1;
            }

            if ((msg == null || msg.trim().isEmpty()) && !canWrite) {
                System.out.println(msg);
                count += 1;
            }
        }

        return count;
    }
 }
