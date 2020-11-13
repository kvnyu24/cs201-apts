// package apt10;
// import apt10.TreeNode;
import java.util.*;

public class LeafCollector {
    public ArrayList<String> leaves = new ArrayList<>();

    public String[] getLeaves(TreeNode tree) {
        if (isLeaf(tree)) return new String[]{""+tree.info};

        while (!isLeaf(tree)) {
            ArrayList<String> leavesLocal = new ArrayList<>();
            collectAndRemove(tree, leavesLocal);
            // System.out.println(leavesLocal);
            // System.out.println(tree);
            
            String concat = "";
            for (String str: leavesLocal) {
                concat += str + " ";
            }
            leaves.add(concat.substring(0, concat.length()-1));    
        }
        leaves.add(""+tree.info);
        return leaves.toArray(new String[leaves.size()]);
    }

    public boolean isLeaf(TreeNode tree) {
        return(tree.left==null&&tree.right==null);
    }

    public void collectAndRemove(TreeNode root, List<String> list) {
        if (root.left!=null) {
            if (isLeaf(root.left)) {
                list.add("" + root.left.info);
                root.left = null;
            } else {
                collectAndRemove(root.left, list);
            }
        }
        if (root.right!=null) {
            if (isLeaf(root.right)) {
                list.add("" + root.right.info);
                root.right = null;
            } else {
                collectAndRemove(root.right, list);
            }
        }
    }
}
