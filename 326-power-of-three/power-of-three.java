class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1)
        return true;
     for(int i=1;i<=19;i++){
        if(Math.pow(3,i)==n)
        return true;
     } 
    
     return false;  
    }
}