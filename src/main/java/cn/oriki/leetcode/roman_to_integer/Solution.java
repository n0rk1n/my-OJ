package cn.oriki.leetcode.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/roman-to-integer/">13. 罗马数字转整数</a>
 */
public class Solution {

    private static final Map<Character, Integer> MAPS = new HashMap<Character, Integer>() {{
        // key：罗马字符；value：对应值
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int amount = 0;
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            int value = MAPS.get(s.charAt(i));
            if (i < length - 1 // 保证有下个元素可以比较的情况
                    && value < MAPS.get(s.charAt(i + 1))) { // 并且，对应的值比下个位置的小
                amount -= value;
            } else {
                amount += value;
            }
        }
        return amount;
    }
}
