// package aptquiz2;
import java.util.*;

// import apt10.TreeNode;

public class TreeBuilder {
    public TreeNode create(int[] values) {
        if (values.length<=0) return null;
        TreeNode root = insertLevelOrder(values, new TreeNode(values[0]), 0);
        inOrder(root);
        return root;
    }

    // Function to insert nodes in level order 
    public TreeNode insertLevelOrder(int[] arr, TreeNode root, int i) { 
        // Base case for recursion 
        if (i < arr.length) { 
            TreeNode temp = new TreeNode(arr[i]); 
            root = temp; 

            // insert left child 
            root.left = insertLevelOrder(arr, root.left, 
                2 * i + 1); 

            // insert right child 
            root.right = insertLevelOrder(arr, root.right, 
                2 * i + 2); 
        } 
        return root; 
    } 


    // Function to print tree nodes in InOrder fashion 
    public void inOrder(TreeNode root) 
    { 
        if (root != null) { 
            inOrder(root.left); 
            System.out.print(root.info + " "); 
            inOrder(root.right); 
        } 
    } 
    
}
