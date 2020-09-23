package apt5;
import java.util.*;

public class Closet {
    public String anywhere(String[] list) {
        Set<String> mySet = new TreeSet<String>(Arrays.asList(list[0].split(" "))); 

        for (int i=1; i<list.length; i++) {
            mySet.addAll(new TreeSet<String>(Arrays.asList(list[i].split(" "))));
        }

        return String.join(" ", mySet);
    }
}
