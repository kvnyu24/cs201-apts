package apt9;
import apt9.TreeNode;
import java.util.*;


public class SortedLeaves {
    public ArrayList<String> leaves = new ArrayList<>();

    public String[] values(TreeNode tree) {
        toLeaf(tree);
        Collections.sort(leaves);

        return leaves.toArray(new String[leaves.size()]);
    }

    public void toLeaf(TreeNode tree) {
        
        if(tree!=null) {
            if(tree.left==null && tree.right==null) leaves.add(String.valueOf((char)tree.info));

            toLeaf(tree.left);
            toLeaf(tree.right);
        }

    }

}
