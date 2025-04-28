package cn.oriki.leetcode.day20250428.island_perimeter;

/**
 * <a href="https://leetcode.cn/problems/island-perimeter/">463. 岛屿的周长</a>
 */
public class Solution {

    public int islandPerimeter(int[][] grid) {
        // 统计地图的长 x 和宽 y
        int x = grid[0].length;
        int y = grid.length;

        // 岛屿的周长
        int length = 0;

        // 遍历每个格子，如果出现了陆地，那么判定它的上下左右是否是海或者边界
        // 如果是海或者边界，那么岛屿的周长就 +1，否则不变
        for (int m = 0; m < y; m++) {
            for (int n = 0; n < x; n++) {
                if (grid[m][n] == 1) {
                    // 该格为陆地

                    // 判断上侧是否为海或者边界
                    if (n == 0 || grid[m][n - 1] == 0) {
                        // 边界 || 海
                        length++;
                    }

                    // 判断下侧是否为海或者边界
                    if (n == x - 1 || grid[m][n + 1] == 0) {
                        // 边界 || 海
                        length++;
                    }

                    // 判断左侧是否为海或者边界
                    if (m == 0 || grid[m - 1][n] == 0) {
                        // 边界 || 海
                        length++;
                    }

                    // 判断右侧是否为海或者边界
                    if (m == y - 1 || grid[m + 1][n] == 0) {
                        // 边界 || 海
                        length++;
                    }
                }
            }
        }
        return length;
    }
}