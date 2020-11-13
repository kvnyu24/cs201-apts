package apt10;
import apt10.TreeNode;
import java.util.*;


public class LeafTrails {
    public TreeMap<Integer, String> trailsMap = new TreeMap<>(); 

    public String[] trails(TreeNode tree) {
        toLeaf(tree, "");

        return trailsMap.values().toArray(new String[trailsMap.values().size()]);
    }

    public void toLeaf(TreeNode tree, String path) {
        if(tree!=null) {
            if(tree.left==null && tree.right==null) trailsMap.put(tree.info, path);
            toLeaf(tree.left, path+"0");
            toLeaf(tree.right,path+"1");
        }
    }

}
