class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(
                b[0] * b[0] + b[1] * b[1],
                a[0] * a[0] + a[1] * a[1]
            )
        );

        int[][] result = new int[k][2];

        for (int[] row : points)
        {
            pq.offer(row);
            while(pq.size()>k)
            {
                pq.poll();
            }
        }

        int t = pq.size();
        for(int i=0;i<t;i++)
        {
            result[i]=pq.poll();
        }

        return result;
    }
}