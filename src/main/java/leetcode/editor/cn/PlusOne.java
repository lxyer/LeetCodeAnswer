//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 示例 1: 
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
// 
//
// 示例 2: 
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
// 
// Related Topics 数组


package leetcode.editor.cn;


import com.sun.org.apache.regexp.internal.RE;

import java.lang.reflect.Array;

public class PlusOne {
    public static void main(String[] args) {
        Solution solution = new PlusOne().new Solution();
        int[] array = {1,2,3};
        System.out.println(solution.plusOne(array).toString());
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] plusOne(int[] digits) {
            int tem = 0;
            boolean flag = true;
            int[] result = new int[digits.length+1];
            for (int i = digits.length - 1; i >= 0; i--) {
                int digit = digits[i];
                if (flag) {
                    flag = false;
                    if (digit + 1 == 10) {
                        result[i+1] = 0;
                        tem = 1;
                    } else {
                        result[i+1] = digit + 1;
                        tem = 0;
                    }
                } else {
                    if (digit + tem == 10) {
                        result[i+1] = 0;
                        tem = 1;
                    } else {
                        result[i+1] = digit + tem;
                        tem = 0;
                    }
                }
            }
            if (tem == 1) {
                result[0] = 1;
                return result;
            }
            System.arraycopy(result, 1, digits, 0, digits.length);
            return digits;
        }
        public int[] plusOne1(int[] digits) {
            for(int i = digits.length-1; i >= 0; i--){
                if(digits[i] == 9){
                    digits[i] = 0;
                } else {
                    digits[i] = digits[i] + 1;
                    return digits;
                }
            }
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}