class Solution {
    public int findNumbers(int[] nums) {
    int resultcount=0;
     for(int i=0;i<nums.length;i++){
        int temp=nums[i];
        int n=0,count=0;
        while(temp!=0){
            n=temp%10;
            count++;
            temp=temp/10;
        }
        if(count%2==0)
        resultcount++;
     } 
     return resultcount;  
    }
}