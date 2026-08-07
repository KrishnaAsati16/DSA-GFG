class Solution {
  public static int minCost(int[] ropes) {
        // Min Heap to store rope lengths
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Add all ropes to heap
        for (int rope : ropes) {
            pq.add(rope);
        }
        
        int totalCost = 0;
        
        // Keep combining until one rope remains
        while (pq.size() > 1) {
            int first = pq.poll();   // smallest rope
            int second = pq.poll();  // second smallest rope
            
            int cost = first + second;
            totalCost += cost;
            
            pq.add(cost); // push the combined rope back
        }
        
        return totalCost;
    }

}