package cn.oriki.leetcode.day20250427.two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/two-sum/">1. 两数之和</a>
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        // 使用 Hash 完成另一个值的查找操作
        // key：数字，value：index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need_num = target - nums[i]; // 求的所需要的数字
            if (map.containsKey(need_num)) { // 查看 map 中是否存在这个数字
                // 存在，则将数据对应的 index 返回
                Integer j_index = map.get(need_num);
                return new int[]{j_index, i};
            } else {
                // 不存在，将本次的数据放入 map 中以便后续遍历的比较
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
