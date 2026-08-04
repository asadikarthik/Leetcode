class Solution {
    public int maxVowels(String s, int k) {
        
        ArrayList<Character> al = new ArrayList<>();
        al.add('a');
        al.add('e');
        al.add('i');
        al.add('o');
        al.add('u');

        int left=0;
        int max =Integer.MIN_VALUE;
        int count=0;

        for(int i=0;i<s.length();i++)
        {
            if(al.contains(s.charAt(i))) count++;

            while(i-left+1 >=k)
            {
                max=Math.max(max,count);
                if(al.contains(s.charAt(left))) count--;
                left++;
            }
        }

        return max;
    }
}