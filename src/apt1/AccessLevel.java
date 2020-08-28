package apt1;

public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String ret = "";
        
        for (int idx=0; idx < rights.length; idx++) {
            if (rights[idx] >= minPermission) {
                ret += "A";
            } else if (rights[idx] < minPermission) {
                ret += "D";
            }
        }

        return ret;
    }
 }
