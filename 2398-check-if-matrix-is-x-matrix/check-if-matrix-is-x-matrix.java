class Solution {
    public boolean checkXMatrix(int[][] grid) {
      int f1=1,f2=1,sum1=0,sum2=0,sum3=0;
      
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(i==j){
                if(grid[i][j]==0){
                f1=0;
                break;
                }else
                sum1=sum1+grid[i][j];
            }
            if(i+j==grid.length-1){
                if(grid[i][j]==0){
                f2=0;
                break;
                }else
                sum2=sum2+grid[i][j];
            }
            sum3=sum3+grid[i][j];
        }
      }
      int n=grid.length;
      if(n%2!=0)
      sum2=sum2-grid[n/2][n/2];
      if(sum3==(sum1+sum2) && f1==1 && f2==1)
        return true;
      else
      return false;

      
    }
}