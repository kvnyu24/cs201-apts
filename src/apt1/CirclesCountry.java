package apt1;
import java.lang.Math;

public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
        int crossedBoarders = 0;

        for (int idx=0; idx < x.length; idx++) {
            int xi = x[idx];
            int yi = y[idx];
            int dist1 = (int)Math.pow(x1 - xi, 2) + (int)Math.pow(y1 - yi, 2);
            int dist2 = (int)Math.pow(x2 - xi, 2) + (int)Math.pow(y2 - yi, 2);

            // if ((dist1 - (int)Math.pow(r[idx], 2)) * (dist2 - (int)Math.pow(r[idx], 2)) < 0) {
            //     crossedBoarders += 1;
            // }

            if (dist1 < (int)Math.pow(r[idx], 2) && dist2 > (int)Math.pow(r[idx], 2)) {
                crossedBoarders += 1;
            } 

            if (dist1 > (int)Math.pow(r[idx], 2) && dist2 < (int)Math.pow(r[idx], 2)) {
                crossedBoarders += 1;
            } 

        }

        return crossedBoarders;
    }
}
