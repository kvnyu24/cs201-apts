package apt9;
import apt9.TreeNode;
import java.util.*;

public class HeightLabel {
    public TreeNode ret;

    public TreeNode rewire(TreeNode t) {
        ret = copy(t);
        int level = traverse(ret, 1);
        return ret;
    }

    public int traverse(TreeNode t, int level) {
        if (t == null) return 0; 
        level += Math.max(traverse(t.left, level), traverse(t.right, level));
        t.info = level;        

        return level;
    }

    public TreeNode copy(TreeNode t){
        if (t == null) return null;

        TreeNode newNode = new TreeNode(t.info, null, null);
        newNode.left= copy(t.left);
        newNode.right= copy(t.right);
        return newNode;
    }
}
