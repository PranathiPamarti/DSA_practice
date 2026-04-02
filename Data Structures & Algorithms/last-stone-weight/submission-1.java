public class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            pq.offer(stone);
        }

        // Safely continue until 1 or 0 elements left
        while (pq.size() > 1) {
            int first = pq.poll();   // largest
            int second = pq.poll();  // second largest

            if (first != second) {
                pq.offer(first - second);  // add the difference back
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}
