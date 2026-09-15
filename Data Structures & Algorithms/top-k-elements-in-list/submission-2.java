class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new TreeMap<>();
        for (int num : nums) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        int[] res = new int[nums.length];
        int j = 0;
        while (j < k) {
            int max = 0;
            int key = 0;
            for (int i : m.keySet()) {
                if (max < m.get(i)) {
                    max = m.get(i);
                    key = i;
                }
            }
            res[j++] = key;
            m.remove(key);
        }
        return Arrays.copyOfRange(res, 0, k);
    }
}
