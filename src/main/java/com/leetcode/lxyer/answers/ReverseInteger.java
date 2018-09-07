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
	 * cost
	 */
	public int reverse(int x){
		boolean up = x > 0 ? true : false;
		int digits = String.valueOf(Math.abs(x)).length();
		int res = 0;
		String string = String.valueOf(Math.abs(x));
		for(int i = 0;i < digits;i++){
			int num = Integer.parseInt(string.substring(i,i + 1));
			int num1 = (int)Math.pow(10, i);
			int num2 = num * num1;
			res += Integer.parseInt(string.substring(i,i + 1)) * (int)Math.pow(10, i);
		}
		if(! up){
			res *= (- 1);
		}
		return res;
	}
	
}
