class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[]{-1, -1};
        for(int i=0; i<nums.length; i++) {
            int rem = target - nums[i];
            if(!map.containsKey(rem)) {
                map.put(nums[i], i);
            } else {
                return new int[]{map.get(rem), i};
            }
        }
        return res;
    }
}
