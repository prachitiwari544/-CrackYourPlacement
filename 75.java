/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.*/

class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        for(int color : nums){
            if(color == 0){
                ++red;
            }
            else if(color == 1){
                ++white;
            }
        }
        white += red;
        for(int i = 0; i < nums.length; i++){
           if(i < red){
             nums[i] = 0;
           }
           else if(i>= red && i < white){
            nums[i] = 1;
           }
           else{
            nums[i] = 2;
           }
        }
    }
}
// testcases
/*
 * test1 input: [2,0,2,1,1,0] output:[0,0,1,1,2,2]
 * test2 input: [2,0,1] output: [0,1,2]
 */