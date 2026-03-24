class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            map.put(temp, map.getOrDefault(temp, 0) + 1); 
            if(map.get(temp)==2)
            return temp;   
        }
        return 'a';
        
    }
}