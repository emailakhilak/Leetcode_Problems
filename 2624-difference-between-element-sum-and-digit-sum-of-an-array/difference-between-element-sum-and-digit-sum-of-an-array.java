class Solution {
    public int differenceOfSum(int[] nums) {
     int sum1=0,sum2=0;
     for(int i=0;i<nums.length;i++){
        int temp=nums[i];
        while(temp!=0){
            sum1=sum1+temp%10;
            temp=temp/10;
        }
     }  
     for(int i=0;i<nums.length;i++){
        sum2=sum2+nums[i];
     } 
     return Math.abs(sum1-sum2);
    }
}