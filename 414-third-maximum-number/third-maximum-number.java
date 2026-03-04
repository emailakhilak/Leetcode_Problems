class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3)
        return nums[nums.length-1];
        int[] result=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                result[j++]=nums[i];
            }
        }
        result[j]=nums[nums.length-1];
        int[] temp=Arrays.copyOf(result,j+1);
        if(temp.length<3)
        return temp[temp.length-1];
        return temp[temp.length-3];
    }
}