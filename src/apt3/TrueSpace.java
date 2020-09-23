package apt3;
import java.util.*;

public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long size = 0;
        for (int sz: sizes) {
            if (sz > 0) {
                if (sz % clusterSize == 0) {
                    size += clusterSize * (sz / clusterSize);
                } else {
                    size += clusterSize * ((int) (sz / clusterSize) + 1);
                }
            }
        }
        return size;
    }
}