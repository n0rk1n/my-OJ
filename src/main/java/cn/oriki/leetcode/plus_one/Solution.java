package cn.oriki.leetcode.plus_one;

/**
 * <a href="https://leetcode.cn/problems/plus-one/">66. 加一</a>
 */
public class Solution {

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] == 9) { // 将最后的 9 全部换为 0
                digits[i] = 0;
            } else {
                digits[i] += 1; // 一旦出现从后往前第一个非 9 元素，则对其 +1 返回
                return digits;
            }
        }

        // 如果所给数组由 n 个 9 组成，则需要对其新建数组，变成 1 加 (n - 1) 个 0
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
}
