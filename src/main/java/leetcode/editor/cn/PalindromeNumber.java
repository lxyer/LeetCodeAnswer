package leetcode.editor.cn;

/**
 * https://leetcode.com/problems/palindrome-number/description/
 * <p>
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * <p>
 * Input: 121
 * Output: true
 * Example 2:
 * <p>
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
public class PalindromeNumber{
	/**
	 *  cost 223ms
	 */
	public boolean isPalindrome1(int x){
		if(x < 0){
			return false;
		}else{
			String str = String.valueOf(x);
			int count = str.length();
			for(int i = 0;i < count / 2;i++){
				if(! str.substring(i,i + 1).equals(str.substring(count - i - 1,count - i))){
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 *  cost 230ms
	 */
	public boolean isPalindrome2(int x){
		// 特殊情况：
		// 如上所述，当 x < 0 时，x 不是回文数。
		// 同样地，如果数字的最后一位是 0，为了使该数字为回文，
		// 则其第一位数字也应该是 0
		// 只有 0 满足这一属性
		if(x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		
		int revertedNumber = 0;
		while(x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x /= 10;
		}
		
		// 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
		// 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
		// 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
		return x == revertedNumber || x == revertedNumber/10;
	}
}
