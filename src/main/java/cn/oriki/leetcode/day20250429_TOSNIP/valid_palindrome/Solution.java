package cn.oriki.leetcode.day20250429_TOSNIP.valid_palindrome;

/**
 * <a href="https://leetcode.cn/problems/valid-palindrome/">125. 验证回文串</a>
 */
// TO SNIP
public class Solution {

    public boolean isPalindrome(String s) {
        // 移出所有的非字母数字字符，并且将字母转换为小写
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            // 回文串可以理解为对称位置的字符是相同的，如果不相同就返回 false
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
