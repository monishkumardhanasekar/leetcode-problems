class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1,n2) -> freq.get(n1) - freq.get(n2));

        for(int n: freq.keySet()){
            minHeap.add(n);
            if(minHeap.size() > k) minHeap.poll();
        }

        int[] res = new int[k];
        for(int i = k-1; i>=0; i--){
            res[i] = minHeap.poll();
        }

        return res;
    }
}