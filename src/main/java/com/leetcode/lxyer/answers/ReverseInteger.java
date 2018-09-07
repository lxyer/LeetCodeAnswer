package com.leetcode.lxyer.answers;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lxyer
 * Date: 07/09/2018
 * Time: 14:41
 * <p>
 * https://leetcode.com/problems/reverse-integer/description/
 * <p>
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * Input: 123
 * Output: 321
 * <p>
 * Example 2:
 * Input: -123
 * Output: -321
 * <p>
 * Example 3:
 * Input: 120
 * Output: 21
 */
public class ReverseInteger{
	/**
	 * cost 46ms
	 */
	public int reverse1(int n){
		int reversed_n = 0;
		while(n != 0){
			int temp = reversed_n * 10 + n % 10;
			n = n / 10;
			if(temp / 10 != reversed_n){
				reversed_n = 0;
				break;
			}
			reversed_n = temp;
		}
		return reversed_n;
	}
	
	/**
	 * cost 46ms
	 */
	public int reverse2(int x){
		int rev = 0;
		while(x != 0){
			int pop = x % 10;
			x /= 10;
			if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)){
				return 0;
			}
			if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < - 8)){
				return 0;
			}
			rev = rev * 10 + pop;
		}
		return rev;
	}
	
}
