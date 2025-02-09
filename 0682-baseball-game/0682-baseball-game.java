class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> s = new Stack<>();
        int sum=0;

        for(String op: operations)
        {
            if(op.equals("+"))
            {
                int pre = s.peek();
                int secondprev = s.elementAt(s.size()-2);
                s.push(pre+secondprev);
            }
            else if(op.equals("D"))
            {
                int pre = s.peek();
                s.push(2*pre);
            }
            else if(op.equals("C"))
            {
                s.pop();
            }
            else
            {
                s.push(Integer.parseInt(op));
            }
        }

        while(!s.isEmpty())
        {
            sum+=s.pop();
        }
        return sum;
    }
}