package cn.oriki.leetcode.day20250428_TOSNIP.climbing_stairs;

/**
 * <a href="https://leetcode.cn/problems/climbing-stairs/">70. 爬楼梯</a>
 */
// TO SNIP
public class Solution {

    public int climbStairs(int n) {
        // 爬一层楼的方法有 1 个
        int p = 1;
        // 爬两层楼的方法有 2 个：
        // 1. 直接两层
        // 2. 一层 + 一层
        int q = 2;

        if (n == 1 || n == 2) {
            // 也就是上述的两个情况，直接包含在一起
            // 即一层就返回 1 种方法，两层就返回 2 种方法
            return n;
        } else {
            // 从第三楼开始，只有两种上楼方式，从前一层再爬一楼和从前二层再爬两楼。
            // 可以推出 f(n) = f(n - 1) + f(n - 2)
            // 本题后台限制，不允许使用递归，所以采用 for 循环来重复递归操作
            int r = -1;
            for (int i = 3; i <= n; i++) {
                r = q + p;
                p = q;
                q = r;
            }
            return r;
        }
    }
}