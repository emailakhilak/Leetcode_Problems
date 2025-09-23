import java.util.Arrays;
class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int result1=nums[n-1]*nums[n-2]*nums[n-3];
        int result2=nums[0]*nums[1]*nums[n-1];
        if(result1>result2)
        return result1;
        else
        return result2;
      }
    }
