class Solution {
    public int smallestIndex(int[] nums) {
     int index=-1;
     for(int i=0;i<nums.length;i++){
        int sum=0;
        int temp=nums[i];
        while(temp!=0)
        {
            sum=sum+temp%10;
            temp=temp/10;
        }
        if(sum==i){
        index=i;
        break;
        }
     }
      return index;
    }
}