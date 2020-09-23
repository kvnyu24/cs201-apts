package apt4;
import java.util.*;

public class Encryption {
    public String encrypt(String message){
        String ret = "";
        HashMap<String, String> encryptMap = new HashMap<>();
        int num = 97; 

        String[] letters = message.split("");
        for (String letter: letters) {
            if (!encryptMap.containsKey(letter)) {
                encryptMap.put(letter, String.valueOf((char) num));
                ret += String.valueOf((char) num);
                num += 1;
            } else {
                ret += encryptMap.get(letter);
            }
        }  

        return ret;
    }
}
