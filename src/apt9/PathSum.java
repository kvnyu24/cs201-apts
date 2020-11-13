package apt9;
import apt9.TreeNode;
import java.util.*;

public class PathSum {
    public HashSet<Integer> pathSums = new HashSet<>();

    public int hasPath(int target, TreeNode tree){
        toLeaf(tree, 0);
        System.out.println(pathSums);
        return pathSums.contains(target)  ? 1 : 0;
    }

    public void toLeaf(TreeNode tree, int prevSum) {
        int sum =prevSum;
        if(tree!=null) {
            sum += tree.info;
            if(tree.left==null && tree.right==null) pathSums.add(sum);

            toLeaf(tree.left, sum);
            toLeaf(tree.right, sum);
        }

    }
}
