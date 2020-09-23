package apt4;
import java.util.*;

public class SoccerLeagues {
    public int[] points(String[] matches) {
        int[] pts = new int[matches.length];
        for (int i=0; i < matches.length; i++) {
            int pt = 0;
            for (int j=0; j < matches.length; j++) {
                pt = this.addPoints(matches[i].substring(j, j+1), pt, false);
            }
            for (int j=0; j < matches.length; j++) {
                pt = this.addPoints(matches[j].substring(i, i+1), pt, true);
            }
            pts[i] = pt;
        }

        return pts;
    }

    public int addPoints(String str, int pt, boolean reversed) {
        System.out.println(str.equals("W"));
        if (!reversed) {
            if (str.equals("W")) {
                pt += 3;
            } else if (str.equals("D")) {
                pt += 1;
            }     
        } else if (reversed) {
            if (str.equals("L")) {
                pt += 3;
            } else if (str.equals("D")) {
                pt += 1;
            }     
        }

        return pt;
    }
}
