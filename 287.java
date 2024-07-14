
// medium level question

/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.*/


class Solution {
    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] check = new boolean[n+1];
        for(int i = 0; i < n; i++){
            if(check[nums[i]]){
                return nums[i];
            }
            check[nums[i]] = true;
        }
        return -1;
    }
    public static void main(String[] args) {
        // testcases for better understanding
        int[] test1 = {1,3,4,2,2};
        int[] test2 = {3,1,3,4,2};
        int[] test3 ={3,3,3,3,3};
        System.out.println(findDuplicate(test1));
        System.out.println(findDuplicate(test2));
        System.out.println(findDuplicate(test3));
    }
}