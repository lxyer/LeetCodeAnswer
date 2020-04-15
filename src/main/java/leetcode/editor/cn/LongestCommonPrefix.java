package leetcode.editor.cn;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiangyangli
 * Date: 2018/9/19
 * Time: 6:13 PM
 * <p>
 * https://leetcode.com/problems/longest-common-prefix/description/
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 * <p>
 * All given inputs are in lowercase letters a-z.
 */
public class LongestCommonPrefix{
	/**
	 * cost 10ms
	 */
	public String longestCommonPrefix1(String[] strs){
		if(strs.length == 0){
			return "";
		}
		int shortStrLength = Integer.MAX_VALUE;
		for(String str : strs){
			if(shortStrLength > str.length()){
				shortStrLength = str.length();
			}
		}
		StringBuilder commonPrefix = new StringBuilder();
		for(int i = 0;i < shortStrLength;i++){
			StringBuilder temChar = new StringBuilder();
			boolean flag = true;
			for(String str : strs){
				String s = str.substring(i,i + 1);
				if("".equals(temChar.toString())){
					temChar.append(s);
				}else if(s.equals(temChar.toString())){
					continue;
				}else{
					flag = false;
					break;
				}
			}
			if(flag){
				commonPrefix.append(temChar);
			}else{
				break;
			}
		}
		return commonPrefix.toString();
	}
	
	/**
	 * cost 6ms
	 */
	public String longestCommonPrefix2(String[] strs){
		if(strs.length == 0){
			return "";
		}
		String prefix = strs[0];
		for(int i = 1;i < strs.length;i++){
			while(strs[i].indexOf(prefix) != 0){
				prefix = prefix.substring(0,prefix.length() - 1);
				if(prefix.isEmpty()){
					return "";
				}
			}
		}
		return prefix;
	}
	
	/**
	 * cost 9ms
	 */
	public String longestCommonPrefix3(String[] strs){
		if(strs == null || strs.length == 0){
			return "";
		}
		for(int i = 0;i < strs[0].length();i++){
			char c = strs[0].charAt(i);
			for(int j = 1;j < strs.length;j++){
				if(i == strs[j].length() || strs[j].charAt(i) != c){
					return strs[0].substring(0,i);
				}
			}
		}
		return strs[0];
	}
	
	/**
	 * cost 14ms
	 */
	public String longestCommonPrefix4(String[] strs){
		if(strs == null || strs.length == 0){
			return "";
		}
		return longestCommonPrefix(strs,0,strs.length - 1);
	}
	
	private String longestCommonPrefix(String[] strs,int l,int r){
		if(l == r){
			return strs[l];
		}else{
			int mid = (l + r) / 2;
			String lcpLeft = longestCommonPrefix(strs,l,mid);
			String lcpRight = longestCommonPrefix(strs,mid + 1,r);
			return commonPrefix(lcpLeft,lcpRight);
		}
	}
	
	String commonPrefix(String left,String right){
		int min = Math.min(left.length(),right.length());
		for(int i = 0;i < min;i++){
			if(left.charAt(i) != right.charAt(i)){
				return left.substring(0,i);
			}
		}
		return left.substring(0,min);
	}
	/**
	 * cost 9ms
	 */
	public String longestCommonPrefix5(String[] strs){
		if(strs.length == 0){
			return "";
		}
		if(strs.length==1){
		    return strs[0];
		}
		String str = strs[0];
		for(int i = 1;i<=str.length();i++){
			String temp = str.substring(0,i);
			for(String s : strs){
				if(!s.startsWith(temp)){
				    return str.substring(0,i-1);
				}
			}
		}
		return str;
	}
	/**
	 * cost 5ms
	 */
	public String longestCommonPrefix6(String[] strs) {
		if (strs == null || strs.length == 0){
			return "";
		}
		int minLen = Integer.MAX_VALUE;
		for (String str : strs){
			minLen = Math.min(minLen, str.length());
		}
		int low = 1;
		int high = minLen;
		while (low <= high) {
			int middle = (low + high) / 2;
			if (isCommonPrefix(strs, middle)){
				low = middle + 1;
			}else{
				high = middle - 1;
			}
		}
		return strs[0].substring(0, (low + high) / 2);
	}
	
	private boolean isCommonPrefix(String[] strs, int len){
		String str1 = strs[0].substring(0,len);
		for (int i = 1; i < strs.length; i++){
			if (!strs[i].startsWith(str1)){
				return false;
			}
		}
		return true;
	}
	
}
