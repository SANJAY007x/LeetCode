class Solution {
    public char repeatedCharacter(String s) {
        
        HashMap<Character,Integer> res=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(res.containsKey(c))
            {
                return c;
            }
            res.put(c,1);
        }
        return ' ';
    }
}
