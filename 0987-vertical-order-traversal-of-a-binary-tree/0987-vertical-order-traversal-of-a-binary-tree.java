class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // col -> row -> minHeap
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        
        dfs(root, 0, 0, map);
        
        List<List<Integer>> result = new ArrayList<>();
        
        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {
            List<Integer> colList = new ArrayList<>();
            
            for (PriorityQueue<Integer> pq : rows.values()) {
                while (!pq.isEmpty()) {
                    colList.add(pq.poll());
                }
            }
            
            result.add(colList);
        }
        
        return result;
    }
    
    private void dfs(TreeNode root, int row, int col,
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map) {
        
        if (root == null) return;
        
        map.putIfAbsent(col, new TreeMap<>());
        map.get(col).putIfAbsent(row, new PriorityQueue<>());
        
        map.get(col).get(row).offer(root.val);
        
        dfs(root.left, row + 1, col - 1, map);
        dfs(root.right, row + 1, col + 1, map);
    }
}