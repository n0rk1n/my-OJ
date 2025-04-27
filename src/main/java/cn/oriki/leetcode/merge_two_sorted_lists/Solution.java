package cn.oriki.leetcode.merge_two_sorted_lists;

/**
 * <a href="https://leetcode.cn/problems/merge-two-sorted-lists/description/">21. 合并两个有序链表</a>
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 特殊情况
        if (list2 == null)
            return list1;
        if (list1 == null)
            return list2;

        ListNode node = new ListNode(); // 设置一个头结点，方便运算
        ListNode current_node = node; // 结果链表的当前指针
        ListNode node1 = list1; // l1 的指针
        ListNode node2 = list2; // l2 的指针
        while (node1 != null && node2 != null) {
            if (node1.val <= node2.val) {
                current_node.next = node1;
                node1 = node1.next;
            } else {
                current_node.next = node2;
                node2 = node2.next;
            }
            current_node = current_node.next;
        }

        // 将剩余未完成的链表直接追加到最后
        if (node1 != null) {
            current_node.next = node1;
        }
        if (node2 != null) {
            current_node.next = node2;
        }

        return node.next; // 将设置的头结点删除，返回剩余部分
    }
}
