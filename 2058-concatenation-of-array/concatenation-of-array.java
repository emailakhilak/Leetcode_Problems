class Solution {
    public int[] getConcatenation(int[] nums) {
       int n=nums.length+nums.length;
       int[] arr=new int[n];
       int j=0;
       for(int i=0;i<nums.length;i++){
        arr[j++]=nums[i];
       }
       for(int i=0;i<nums.length;i++){
        arr[j++]=nums[i];
       }
       return arr;
    }
}