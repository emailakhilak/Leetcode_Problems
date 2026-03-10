class Solution {
    public String defangIPaddr(String address) {
        char arr[]=address.toCharArray();
        String s="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='.')
            s=s+"[.]";
            else
            s=s+arr[i];
        }
        return s;      
    }
}