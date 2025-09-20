class Solution {
    public boolean checkDivisibility(int n) {
    int sum=0,pro=1,temp=n;
     while(n!=0){
        sum=sum+n%10;
        pro=pro*(n%10);
        n=n/10;
     }
     int result=sum+pro;
     if(temp%result==0)
     return true;
     else
     return  false;

    }
}