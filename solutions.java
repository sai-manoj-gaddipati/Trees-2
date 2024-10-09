// Problem#2: Sum root to leaf nodes
// Time complexity: O(N)
// Space Complexity: O(H) where H is height of tree (when we use recursion each step goes into a stack and gets popped when done
// Algorithm: Recursively call child nodes until leaf node is reached, when leaf node is reached add the sum to global variable 'result', repeat for all leaf nodes
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
        }

        helper(node.left, curSum);
        helper(node.right, curSum);
    }
}
