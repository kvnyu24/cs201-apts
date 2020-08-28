package apt1;

public class Totality {
    public int sum(int[] a, String stype) {
        int sum = 0;

        if (stype.toLowerCase().equals("odd")) {
            for (int idx=0; idx < a.length; idx++) {
                if (idx % 2 == 1) {
                    sum += a[idx];
                } 
            }
        } else if (stype.toLowerCase().equals("even")) {
            for (int idx=0; idx < a.length; idx++) {
                if (idx % 2 == 0) {
                    sum += a[idx];
                } 
            }
        } else if (stype.toLowerCase().equals("all")) {
            for (int idx=0; idx < a.length; idx++) {
                sum += a[idx];
            }
        }                

        return sum;
    }

}
