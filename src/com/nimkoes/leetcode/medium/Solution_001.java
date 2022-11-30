package com.nimkoes.leetcode.medium;

public class Solution_001 {
    private int temp = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root.right != null) bstToGst(root.right);
        root.val += temp;
        temp = root.val;
        if (root.left != null) bstToGst(root.left);
        return root;
    }
}

/* result summary
Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search Tree to Greater Sum Tree.
Memory Usage: 41.6 MB, less than 56.03% of Java online submissions for Binary Search Tree to Greater Sum Tree.
 */

// given
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
