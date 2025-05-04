package cn.oriki.leetcode.day20250428_TOSNIP.fibonacci_number;

/**
 * <a href="https://leetcode.cn/problems/fibonacci-number/">509. 斐波那契数</a>
 */
// TO SNIP
public class Solution {

    public int fib(int n) {
        // f(0) = 0
        // f(1) = 1
        if (n < 2) {
            return n;
        }
        int p, q = 0, r = 1;
        for (int i = 2; i <= n; ++i) { // example: n = 2，执行一次，取 r 的值
            // 非递归方式
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}