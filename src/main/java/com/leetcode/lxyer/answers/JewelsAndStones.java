package com.leetcode.lxyer.answers;

import java.util.HashMap;
import java.util.Map;

/**
 * ### [771\. 宝石与石头](https://leetcode-cn.com/problems/jewels-and-stones/)
 * <p>
 * Difficulty: **简单**
 * <p>
 * <p>
 *  给定字符串`J` 代表石头中宝石的类型，和字符串 `S`代表你拥有的石头。 `S` 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * <p>
 * `J` 中的字母不重复，`J` 和 `S`中的所有字符都是字母。字母区分大小写，因此`"a"`和`"A"`是不同类型的石头。
 * <p>
 * **示例 1:**
 * <p>
 * ```
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 * ```
 * <p>
 * **示例 2:**
 * <p>
 * ```
 * 输入: J = "z", S = "ZZ"
 * 输出: 0
 * ```
 * <p>
 * **注意:**
 * <p>
 * *   `S` 和 `J` 最多含有50个字母。
 * *   `J` 中的字符不重复。
 * <p>
 * <p>
 * #### Solution
 * <p>
 * Language: **C++**
 * <p>
 * ```c++
 * ​
 * ```
 */
public class JewelsAndStones {


    /**
     * 执行用时 :2 ms, 在所有 java 提交中击败了53.27%的用户
     * 内存消耗 :34.5 MB, 在所有 java 提交中击败了91.21%的用户
     */
    class Solution1 {
        public int numJewelsInStones(String J, String S) {
            int count = 0;
            char[] arr1 = J.toCharArray();
            char[] arr2 = S.toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            for (char c : arr1) {
                map.put(c, 1);
            }
            for (char c : arr2) {
                if (map.containsKey(c)) {
                    count++;
                }
            }
            return count;
        }
    }

    /**
     * 利用一个字母hash表来记录某些字母是否存在，A的ASCII是65，a的ASCII是97，大写和小写之间还有一个没用的字符，所以表的大小应该为58，这几个关键值都是需要记住的代码
     * 执行用时 :1 ms, 在所有 java 提交中击败99.90%的用户
     * 内存消耗 :34.6 MB, 在所有 java 提交中击败了91.10%的用户
     */
    class Solution2 {
        public int numJewelsInStones(String J, String S) {
            int[] hash = new int[58];
            int count = 0;
            for (char c : J.toCharArray()) {
                hash[c - 65] = 1;
            }
            for (char c : S.toCharArray()) {
                if (hash[c - 65] == 1) {
                    count++;
                }
            }
            return count;
        }
    }
}