import java.util.Arrays;
class Solution {
    public int[] singleNumber(int[] nums) {
     int[] result=new int[nums.length];
     int k=0;
     for(int i=0;i<nums.length;i++) {
        int count=0;
        for(int j=0;j<nums.length;j++){
         if(nums[i]==nums[j])
         count++;
        }
        if(count!=2)
        result[k++]=nums[i];
     } 
     return Arrays.copyOf(result,k); 
    }
}