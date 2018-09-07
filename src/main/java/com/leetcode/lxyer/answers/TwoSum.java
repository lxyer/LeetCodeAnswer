package com.leetcode.lxyer.answers;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lxyer
 * Date: 07/09/2018
 * Time: 13:57
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * https://leetcode.com/problems/two-sum/description/
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum{
	public int[] twoSum(int[] nums, int target) throws IllegalAccessException{
		for(int i = 0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]+nums[j]==target){
					return new int[]{i,j};
				}
			}
		}
		return null;
	}
}
