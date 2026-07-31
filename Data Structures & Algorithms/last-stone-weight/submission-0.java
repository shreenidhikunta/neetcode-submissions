class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue <Integer> weights = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones)
        {
            weights.offer(stone);
        }

        while (weights.size() > 1)
        {
           int first = weights.poll();
           int second = weights.poll();

           if (first != second)
           {
             weights.offer(first - second);
           }

        }

        return weights.isEmpty() ? 0 : weights.poll(); //if it is empty, it will return 0. if it is not empty, it will return the last element

    }
}
