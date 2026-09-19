class Solution {
    public int[] twoSum(int[] nums, int target) {

      int temp[] = new int[2];

      TreeMap<Integer ,List<Integer>> tree = new TreeMap<>();

      for(int i = 0; i < nums.length; i++){
        tree.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
      }
     
      while(tree.size()!=0){
            if(tree.firstEntry().getKey() + tree.lastEntry().getKey() > target){
                 tree.pollLastEntry();
            }
            else if(tree.firstEntry().getKey() + tree.lastEntry().getKey() < target){
                 tree.pollFirstEntry();
            }
            else{
                if(tree.firstEntry().getKey() == tree.lastEntry().getKey()){
                    temp[0] = tree.firstEntry().getValue().get(0);
                    temp[1] = tree.lastEntry().getValue().get(1);
                return temp;
                }
                temp[0] = tree.firstEntry().getValue().get(0);
                temp[1] = tree.lastEntry().getValue().get(0);
                return temp;
            }
      }




     
       return temp; 
    }
}