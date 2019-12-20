package com.leetcode.lxyer.answers;

/**
 * ### [1281\. 整数的各位积和之差](https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
 *
 * Difficulty: **简单**
 *
 *
 * 给你一个整数 `n`，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 *
 * **示例 1：**
 *
 * ```
 * 输入：n = 234
 * 输出：15
 * 解释：
 * 各位数之积 = 2 * 3 * 4 = 24
 * 各位数之和 = 2 + 3 + 4 = 9
 * 结果 = 24 - 9 = 15
 * ```
 *
 * **示例 2：**
 *
 * ```
 * 输入：n = 4421
 * 输出：21
 * 解释：
 * 各位数之积 = 4 * 4 * 2 * 1 = 32
 * 各位数之和 = 4 + 4 + 2 + 1 = 11
 * 结果 = 32 - 11 = 21
 * ```
 *
 * **提示：**
 *
 * *   `1 <= n <= 10^5`
 */
public class SubtractProductAndSum {
    public static void main(String[] args) {
        int n  = 705;
        int sum=0,plus=1;
        if (n<0){
            n = 0 - n;
        }
        while (n>0) {
            int value=n%10;
            sum+=value;
            plus*=value;
            n=n/10;
        }
        System.out.println(plus-sum);
    }
    /**
     * 执行用时 :0 ms, 在所有 java 提交中击败了100.00%的用户
     * 内存消耗 :33.2 MB, 在所有 java 提交中击败了100.00%的用户
     */
    public int subtractProductAndSum(int n) {
        int sum=0,plus=1;
        if (n<0){
            n = 0 - n;
        }
        while (n>0) {
            int value=n%10;
            sum+=value;
            plus*=value;
            n=n/10;
        }
        return plus - sum;
    }
}
