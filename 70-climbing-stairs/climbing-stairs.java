class Solution {
    public int climbStairs(int n) {
     int ways1=1;
     int ways2=2;
     int ways3;
     int[] arr=new int[n];
     int i=0;
     while(i<n){
        arr[i]=ways1;
        ways3=ways1+ways2;
        ways1=ways2;
        ways2=ways3;
        i++;
     }
     return arr[n-1];
     
    }
}