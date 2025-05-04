package cn.oriki.leetcode.day20250429_TOSNIP.search_insert_position;

/**
 * <a href="https://leetcode.cn/problems/search-insert-position/">35. 搜索插入位置</a>
 */
// TO SNIP
public class Solution {

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}