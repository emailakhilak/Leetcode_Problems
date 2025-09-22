class Solution {
    public boolean isSameAfterReversals(int num) {
      int reverse=0,result=0,temp=num;
      while(num!=0){
        reverse=reverse*10+num%10;
        num=num/10;
      }
      while(reverse!=0){
        result=result*10+reverse%10;
        reverse=reverse/10;
      } 
      if(temp==result)
      return true;
      else
      return false;

    }
}