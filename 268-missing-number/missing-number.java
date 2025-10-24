import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    int temp=nums.length;
    int[] arr=new int[temp+1];
    for(int i=0;i<=temp;i++){
     arr[i]=i;
    }
    int result=0;
    for(int i=0;i<nums.length;i++){
        if(arr[i]!=nums[i])
        return arr[i];
    }
    return temp;

}
}