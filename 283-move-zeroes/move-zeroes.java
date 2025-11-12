class Solution {
    public void moveZeroes(int[] nums) {
    int[] arr2=new int[nums.length];
    int j=0;
    for(int i=0;i<nums.length;i++){
       if(nums[i]!=0)
       arr2[j++]=nums[i];
    }
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0)
        arr2[j++]=nums[i];
    }
    for(int i=0;i<nums.length;i++){
        nums[i]=arr2[i];
    }
}
}