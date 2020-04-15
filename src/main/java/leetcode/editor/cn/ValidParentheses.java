package leetcode.editor.cn;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Date: 2019-01-08
 * Time: 22:22
 * ### [20\. Valid Parentheses](https://leetcode-cn.com/problems/valid-parentheses/)
 * <p>
 * <p>
 * Given a string containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Note that an empty string is also considered valid.
 * <p>
 * **Example 1:**
 * <p>
 * **Example 2:**
 * <p>
 * **Example 3:**
 * <p>
 * **Example 4:**
 * <p>
 * **Example 5:**
 * <p>
 * ```
 * Input: "()"
 * Output: true
 * Input: "()[]{}"
 * Output: true
 * Input: "(]"
 * Output: false
 * Input: "([)]"
 * Output: false
 * Input: "{[]}"
 * Output: true
 */
public class ValidParentheses{
	/**
	 * cost 13ms
	 */
	public boolean isValid(String s){
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch=='('||ch=='['||ch=='{'){
				stack.push(ch);
			}else {
				if(stack.isEmpty()){
					return false;
				}
				char topChar = stack.pop();
				if(topChar=='('&&ch!=')'){
				    return false;
				}else if(topChar=='['&&ch!=']'){
					return false;
				}else if(topChar=='{'&&ch!='}'){
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
