package leetcode.editor.cn;

/**
 * ### [21\. 合并两个有序链表Copy for MarkdownCopy for Markdown](https://leetcode-cn.com/problems/merge-two-sorted-lists/)
 * <p>
 * Difficulty: **简单**
 * <p>
 * <p>
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * **Example:**
 * <p>
 * ```
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * ```
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode lastNode = l3;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                lastNode.next = l1;
                l1 = l1.next;
            } else {
                lastNode.next = l2;
                l2 = l2.next;
            }
            lastNode = lastNode.next;
        }

        if (l1 != null) {
            lastNode.next = l1;
        } else {
            lastNode.next = l2;
        }

        return l3.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
