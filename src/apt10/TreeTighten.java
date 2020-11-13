package apt10;
import apt10.TreeNode;
import java.util.*;


public class TreeTighten {

    public TreeNode tighten(TreeNode t) {
		if(t == null) return t;		
        
        // postorder
		t.left = tighten(t.left);
		t.right = tighten(t.right);
		
		if(t.left == null && t.right != null)
			t = t.right;
		else if(t.left != null && t.right == null)
			t = t.left;
				
		return t;
    }

}
