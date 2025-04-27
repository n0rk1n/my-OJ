package cn.oriki.leetcode.two_sum;

/**
 * <a href="https://leetcode.cn/problems/two-sum/">1. 两数之和</a>
 */
public class Solution2 {

    public int[] twoSum(int[] nums, int target) {
        // 暴力枚举可能性
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                // 两数之和 == target，则返回结果
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[0];
    }
}
