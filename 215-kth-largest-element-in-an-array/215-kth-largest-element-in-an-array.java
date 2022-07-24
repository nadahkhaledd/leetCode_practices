class Solution {
    
    /// we keep the max k elements in the queue and return the minimum which is what we need
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k)
                queue.poll();
        }
        
        return queue.peek();
        
    }
}