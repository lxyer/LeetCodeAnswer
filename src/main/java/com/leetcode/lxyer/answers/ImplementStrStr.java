package com.leetcode.lxyer.answers;

/**
 * ### [28\. Implement strStr()](https://leetcode.com/problems/implement-strstr/)
 * <p>
 * Difficulty: **Easy**
 * <p>
 * <p>
 * Implement .
 * <p>
 * Return the index of the first occurrence of needle in haystack, or **-1** if needle is not part of haystack.
 * <p>
 * **Example 1:**
 * <p>
 * ```
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * ```
 * <p>
 * **Example 2:**
 * <p>
 * ```
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * ```
 * <p>
 * **Clarification:**
 * <p>
 * What should we return when `needle` is an empty string? This is a great question to ask during an interview.
 * <p>
 * For the purpose of this problem, we will return 0 when `needle` is an empty string. This is consistent to C's  and Java's .
 * <p>
 * <p>
 * #### Solution
 * <p>
 * Language: **Java**
 */
public class ImplementStrStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "llll";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int a = haystack.length();
        int b = needle.length();
        if (a < b) {
            return -1;
        }
        if (b == 0) {
            return 0;
        }
        return haystack.indexOf(needle);
    }
}
