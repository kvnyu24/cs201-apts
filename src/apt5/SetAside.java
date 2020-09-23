package apt5;
import java.util.*;

public class SetAside {
    public String common(String[] list) {
        Set<String> mySet = new TreeSet<String>(Arrays.asList(list[0].split(" "))); 

        for (int i=1; i<list.length; i++) {
            mySet.retainAll(new TreeSet<String>(Arrays.asList(list[i].split(" "))));
        }
        return String.join(" ", mySet);
    }
}
