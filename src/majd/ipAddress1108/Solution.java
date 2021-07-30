package majd.ipAddress1108;

import javax.swing.tree.TreeNode;

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public Integer countLeafNodes(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.isLeaf()) {
            return 1;
        } else {
            return countLeafNodes(node.getChildAt(0)) + countLeafNodes(node.getChildAt(1));
        }
    }
}
