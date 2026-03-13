import java.util.*;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        if(nums.length==0)
        return list;
        int x=nums[0];
        if(nums.length==0)
        return list;
        String s="";
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]+1)!=nums[i+1]){
                if(nums[i]!=x)
                list.add(x+"->"+nums[i]);
                else  
                list.add(String.valueOf(x));
                x=nums[i+1];
            }
        }
        if(x==nums[nums.length-1])
        list.add(String.valueOf(x));
        else 
        list.add(x+"->"+nums[nums.length-1]);
        
        return list;   
    }
}