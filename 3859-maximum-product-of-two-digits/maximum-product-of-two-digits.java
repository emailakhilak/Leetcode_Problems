class Solution {
    public int maxProduct(int n) {
      int size=(int)(Math.log10(n)+1);
      int[] arr=new int[size];
      int j=0;
      while(n!=0){
        arr[j++]=n%10;
        n=n/10;
      }
      int max=arr[0],result=0;;
      for(int i=0;i<size;i++){
        for(int k=i+1;k<size;k++){
          result=arr[i]*arr[k];
          if(result>max)
          max=result;
        }
      } 
      return max;
    }
}