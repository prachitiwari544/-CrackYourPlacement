
// easy level question

/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:*/


class Solution2 {
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
        
    }
    public static void main(String[] args) {

        //testcases for better understanding
        int[] test1 = {1,1,2};
        System.out.println(removeDuplicates(test1));

        int[] test2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(test2));

       
    }
}