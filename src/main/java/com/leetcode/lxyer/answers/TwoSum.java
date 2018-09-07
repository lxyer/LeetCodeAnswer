package com.leetcode.lxyer.answers;

import java.util.HashMap;

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
	/**
	 * cost 110ms
	 */
	public int[] twoSum1(int[] nums, int target) throws IllegalAccessException{
		for(int i = 0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]+nums[j]==target){
					return new int[]{i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	/**
	 * cost 12ms
	 */
	public int[] twoSum2(int[] nums, int target) throws IllegalAccessException{
		HashMap<Integer, Integer> map = new HashMap();
		for(int i=0;i<nums.length;i++){
			map.put(nums[i],i);
		}
		for(int i=0;i<nums.length;i++){
			int temp = target-nums[i];
			if(map.containsKey(temp)&&map.get(temp)!=i){
				return new int[]{(int)map.get(temp),i};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	/**
	 * cost 9ms
	 */
	public int[] twoSum3(int[] nums, int target) throws IllegalAccessException{
		HashMap<Integer, Integer> map = new HashMap();
		for(int i=0;i<nums.length;i++){
			int temp = target-nums[i];
			if(map.containsKey(temp)){
				return new int[]{map.get(temp),i};
			}else {
				map.put(nums[i],i);
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
