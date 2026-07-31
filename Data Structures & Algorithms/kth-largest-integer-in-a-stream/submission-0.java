class KthLargest {
    private int K;
    private PriorityQueue<Integer> elements;

    public KthLargest(int k, int[] nums) 
    {
        K = k;
        elements = new PriorityQueue<>();

        for (int i : nums)
        {
            add(i); //add is NOT a priority queue method, just a method we defined
        }

    }
    
    public int add(int val) 
    {
        elements.offer(val); //add value to the heap

        if (elements.size() > K)
        {
            elements.poll(); //remove the smallest element
        }

        return elements.peek();
        
    }
}
