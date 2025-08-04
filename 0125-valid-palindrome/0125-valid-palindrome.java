import java.util.*;
class Solution {
    public boolean isPalindrome(String s)
    {
         if(s.isEmpty())return true;
        
        
        String result="";
        for(int i=0;i<s.length();i++)
        {
            char x = s.charAt(i);
            
            if( (int)x>=65 && (int)x <=90 )
            {
                result+=s.charAt(i);
            }
            else if( (int)x>=97 && (int)x <=122)
            {
                result+=s.charAt(i);
            }
            else if(Character.isDigit(s.charAt(i)))
            {
                result+=s.charAt(i);
            }
        }
        String k  = result.toLowerCase();
        
        String rev="";
        for(int i=k.length()-1;i>=0;i--)
        {
            rev+= k.charAt(i);
        }
        
        if(k.compareTo(rev) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}