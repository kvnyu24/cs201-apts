package apt9;
import apt9.TreeNode;
import java.util.*;

public class LevelCount {
    public int levelCount = 0;

    public int count(TreeNode t, int level) {
        countLevel(t, level, 0);
        return levelCount;
    }

    public void countLevel(TreeNode t, int level, int count) {
        if (t != null) {
            if (level==count) levelCount ++;
            count ++;
            countLevel(t.left, level, count);
            countLevel(t.right, level, count);
        }

    }
}
