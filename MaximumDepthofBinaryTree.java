/**
  * Problem:
  * Given a binary tree, find its maximum depth.
  * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
  *
  * Solution:
  * this's my logic:
  * It's a recursion question, we need to figure out the formula,
  * the formula is obvious, depth(root) = Math.max(depth(root.left), depth(root.right))+1
  * the end condition is depth(null) = 0;
  * 
  * How else we can do?
  * Using iterating replace recursion, it will be more space efficient.
  */
  
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        // use recursion, depth(root) = max(depth(root.left), depth(root.right))+1;
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}
