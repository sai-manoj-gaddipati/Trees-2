class Solution {
    int result;
    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return result;
    }

    private void helper(TreeNode node, int curSum){
        if (node==null) return;

        curSum = curSum*10 + node.val;
        if (node.left == null && node.right == null){
            result += curSum;
            return;
        }

        helper(node.left, curSum);
        helper(node.right, curSum);
    return;
    }
}
