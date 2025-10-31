import java.util.Arrays;
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
      int[] hasharr=new int[1000];
      int[] res=new int[nums.length];
      int j=0;
      Arrays.fill(hasharr,0);
      for(int i=0;i<nums.length;i++){
        hasharr[nums[i]]+=1;
      } 
      for(int i=0;i<hasharr.length;i++){
        if(hasharr[i]==2)
        res[j++]=i;
      }
      return Arrays.copyOf(res,j);
    }
}