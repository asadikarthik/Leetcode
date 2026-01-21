class Solution {
    public boolean rotateString(String s, String goal) {
        
        for(int i=0;i<s.length();i++)
        {
            s = s.substring(1,s.length()) + s.substring(0,1);
            if(s.equals(goal))
            {
                return true;
            }
            //System.out.println(s);
        }
        return false;
    }
}