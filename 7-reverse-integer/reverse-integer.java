class Solution {
    public int reverse(int x) {
     int reverse=0;
     if(x>Integer.MAX_VALUE)
     return 0;
     while(x!=0){
       int r=x%10;
        x=x/10;
        if(reverse>Integer.MAX_VALUE/10 || reverse==Integer.MAX_VALUE/10 && r>7)
        return 0;
        else if(reverse<Integer.MIN_VALUE/10 || reverse==Integer.MIN_VALUE/10 && r<-8)
        return 0;
        
        reverse=reverse*10+r;
        
        }
        return reverse;

     

    }
}