class MedianFinder {

    PriorityQueue<Integer> left;   // Max Heap
    PriorityQueue<Integer> right;  // Min Heap

    public MedianFinder() {
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }

    public void addNum(int num) {

        // Step 1: Add to left
        left.offer(num);

        // Step 2: Make sure every element in left <= every element in right
        if (!right.isEmpty() && left.peek() > right.peek()) {
            int a = left.poll();
            int b = right.poll();

            left.offer(b);
            right.offer(a);
        }

        // Step 3: Balance sizes
        if (left.size() > right.size() + 1) {
            right.offer(left.poll());
        }

        if (right.size() > left.size()) {
            left.offer(right.poll());
        }
    }

    public double findMedian() {

        // Odd number of elements
        if (left.size() > right.size()) {
            return left.peek();
        }

        // Even number of elements
        return (left.peek() + right.peek()) / 2.0;
    }
}