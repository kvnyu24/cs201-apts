package apt2;
import java.util.*; 


public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        int retIdx = -1;

        for (int i = 0; i < orders.length; i++) {
            boolean buy = true;
            String[] orderIngredients = orders[i].split("\\s+");
            for (String ingredient: orderIngredients) {
                if (!Arrays.stream(available)
				.anyMatch(x -> ingredient.equals(x))) {
                    buy = false;
                }
            }
            if (buy) {
                retIdx = i;
                return retIdx;
            }
        }

        return retIdx; 
    }
 }
