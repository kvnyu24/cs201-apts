// package aptquiz2;
import java.util.*;

public class TreeSort {
    public ArrayList<Integer> retNodes = new ArrayList<>();

    public int[] sort(TreeNode tree) {
        preOrder(tree);
        Collections.sort(retNodes);
        return retNodes.stream().mapToInt(i -> i).toArray();
    }

    public void preOrder(TreeNode tree) {
        if (tree != null) {
            retNodes.add(tree.info);
            preOrder(tree.left);
            preOrder(tree.right);
        }
    }

}
