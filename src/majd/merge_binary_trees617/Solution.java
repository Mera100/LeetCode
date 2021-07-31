package majd.merge_binary_trees617;

class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode newRoot;
        if (root1 != null && root2 != null) {
            newRoot = new TreeNode(root1.val + root2.val);
            newRoot.right = mergeTrees(root1.right, root2.right);
            newRoot.left = mergeTrees(root1.left, root2.left);
        } else if (root1 == null && root2 != null) {
            newRoot = new TreeNode(root2.val);
            newRoot.right = mergeTrees(null, root2.right);
            newRoot.left = mergeTrees(null, root2.left);
        } else if (root1 != null && root2 == null) {
            newRoot = new TreeNode(root1.val);
            newRoot.right = mergeTrees(root1.right, null);
            newRoot.left = mergeTrees(root1.left, null);
        } else {
            newRoot = null;
        }
        return newRoot;

    }
}