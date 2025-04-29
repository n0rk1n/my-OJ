package cn.oriki.leetcode.day20250429.same_tree;

/**
 * <a href="https://leetcode.cn/problems/same-tree/">100. 相同的树</a>
 */
public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}