class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]=new int[2];
        for(int i=0;i<numbers.length-1;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]+numbers[j]==target)
                {
                    arr[0]=i+1;
                    arr[1]=j+1;
                    //System.out.println(numbers[i]+" "+numbers[j]);
                    return arr;
                }
            }
        }
        return arr;
    }
}