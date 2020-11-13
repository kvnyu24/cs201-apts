package apt10;
import apt10.TreeNode;
import java.util.*;


public class UniqueTreeValues {
    public HashSet<Integer> uniqueNodes = new HashSet<>();  
    public ArrayList<Integer> retNodes = new ArrayList<>();

    public int[] unique(TreeNode root) {
        preOrder(root);
        Collections.sort(retNodes);
        System.out.println(retNodes);
        return retNodes.stream().mapToInt(Integer::intValue).toArray();
    }

    public void preOrder(TreeNode tree) {
        if (tree != null) {
            if (!uniqueNodes.contains(tree.info)) {
                uniqueNodes.add(tree.info);
                retNodes.add(tree.info);
            }
            preOrder(tree.left);
            preOrder(tree.right);
        }
    }

}
