class Solution {
    public int differenceOfSums(int n, int m) {
     int[] arr1=new int[n+1];
     int[] arr2=new int[n+1];
     int j=0,k=0,sum1=0,sum2=0;
     for(int i=0;i<=n;i++){
        if(i%m==0)
        arr1[j++]=i;
        else
        arr2[k++]=i;
     } 
     for(int i=0;i<j;i++){
        sum1=sum1+arr1[i];
     }
     for(int i=0;i<k;i++){
        sum2=sum2+arr2[i];
     }
     return sum2-sum1;  
    }
}