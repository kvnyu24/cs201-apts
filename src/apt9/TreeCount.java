package apt9;
import apt9.TreeNode;
import java.util.*;


public class TreeCount {
    public int treeCount = 0;

    public int count(TreeNode tree) {
        preOrder(tree);
        return treeCount;
    }

    public void preOrder(TreeNode tree) {
        if (tree != null) {
            treeCount ++;
            preOrder(tree.left);
            preOrder(tree.right);
        }
    }
}
