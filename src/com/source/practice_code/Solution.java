package com.source.practice_code;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		int[] arr = {6,3,4,3,6,5};
	     System.out.println(containsDuplicate(arr));
	}
	
	public static boolean containsDuplicate(int[] nums) {
		HashSet h = new HashSet();
		
		if(nums.length==00 || nums == null)
			return false;
		
		for (int n : nums){
	         if(!h.add(n)) {
	        	 return true;
	         }
	        }
	        return false;
	    }

}
