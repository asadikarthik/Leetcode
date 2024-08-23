class Solution {
    public int findComplement(int num) {
        String s =Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            char c =sb.charAt(i);
            if(c=='1')
            {
                sb.replace(i,i+1,"0");
            }
            else
            {
                sb.replace(i,i+1,"1");
            }
        }
        int x =Integer.parseInt(sb.toString(),2);
        return x;
    }
}