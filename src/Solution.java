public class Solution {
    /*
     * @param nums: The integer array you should partition
     * @param k: An integer
     * @return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {

        if(nums == null || nums.length == 0){
            return -1;
        }

        int left = 0;
        int right = nums.length -1;

        while(left < right){

            while (left < right && nums[left] < k){
                left++;
            }
            while (left < right && nums[right] >= k){
                right--;
            }

            //why we need left < right comparision here?

                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                


        }

        //why we need to compare again
        if(nums[left] < k ){
            return left+1;
        }

        return left;
    }
}