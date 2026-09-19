class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> val = new HashSet<>();
        for(Integer i : nums){
            val.add(i);
        }

        return val.size() != nums.length;
    }
}