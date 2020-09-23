import apt1.*;

public class Apt1 {
    public static void main(String[] args) throws Exception {
        // Totality
        // int[] intArray = new int[]{ 1,534,300,4,5,6,7,8,9,10 }; 
        // String stype = "even";

        // Totality tot = new Totality();
        // System.out.println(tot.sum(intArray, stype));


        // AccessLevel
        // int[] rights = new int[]{ 0, 1, 2, 3, 4, 5 }; 
        // int minPermission = 2;

        // AccessLevel al = new AccessLevel();
        // System.out.println(al.canAccess(rights, minPermission));


        // Gravity
        // int time = 3;
        // int velo = 0;

        // Gravity gravity = new Gravity();
        // System.out.println(gravity.falling(time, velo));


        // Starter
        // String[] words = new String[]{"zebras", "zebra", "aardvarks", "yak", "yaks", "zebras", "elephants",
        // "zebras", "zebra", "aardvarks", "yak", "yaks", "zebras", "elephants"};
        // String first = "z";

        // Starter start = new Starter();
        // System.out.println(start.begins(words, first));

        // CirclesCountry
        int[] x = new int[]{95, 198, -248};
        int[] y = new int[]{-579, 738, -946};
        int[] r = new int[]{959, 64, 161};
        int x1 = -696;
        int y1 = -492;
        int x2 = 235;
        int y2 = 383;

        CirclesCountry cirlces = new CirclesCountry();
        System.out.println(cirlces.leastBorders(x, y, r, x1, y1, x2, y2));
    }
}
