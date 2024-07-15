class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // Prefix Sum + Hashmap
        // TC: O(n + k), SC: O(k)
        int n = nums.length;
        // <remainder of prefixSum, the count of this remainder>
        Map<Integer, Integer> map = new HashMap<>();
        // Before we iterate the array, prefixSum is already 0
        // So the initial count of prefixSum % k == 0 should be 1
        // In this case we can still use the same formula to calculate the count
        // when r = prefixSum % k == 0
        map.put(0, 1);
        int prefixSum = 0;
        for (int i : nums) {
            prefixSum += i;
            int r = 0;
            if (prefixSum >= 0 || prefixSum % k == 0) {
                r = prefixSum % k;
            } else {
                r = k - ((-prefixSum) % k);
            }
            map.put(r, map.getOrDefault(r, 0) + 1);
        }
        int ans = 0;
        for (int i : map.keySet()) {
            int count = map.get(i);
            // Any pair (a, b) within 1, 2, ..., count can form up a subarray nums[a..b]
            // so that sum(nums[a..b]) % k == 0
            // In this case there are C(count, 2) pairs that satisfy the requirement
            ans += count * (count - 1) / 2;
        }
        return ans;
    }
}
