package ContainsDuplicate;

//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
//
//Example 1:
//
//Input: nums = [1, 2, 3, 3]
//
//Output: true
//
//Example 2:
//
//Input: nums = [1, 2, 3, 4]
//
//Output: false


class Solution {
    public static boolean hasDuplicate(int[] nums) {

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i!=j) {
                    if(nums[i]==nums[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 3};
        System.out.println(hasDuplicate(nums));
        int[] nums2 = new int[]{1, 2, 3, 4};
        System.out.println(hasDuplicate(nums2));
    }

}
