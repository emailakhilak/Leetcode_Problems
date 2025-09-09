class Solution {
    public int mySqrt(int x) {
    int result=0;
    if(x==1)
    result=1;
     for(int i=1;i<=x/2;i++){
        long temp=(long)i*i;
        if(temp==x)
        result=i;
        else if(temp<x)
        result=i;
        else
        break;
     }  
     return result;
    }
}