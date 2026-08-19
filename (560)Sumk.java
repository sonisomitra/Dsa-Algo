class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> hmap = new HashMap<>();
    int prefix = 0;
    int count = 0;
    hmap.put(0,1);
    for(int i = 0;i<nums.length;i++){
    prefix += nums[i]; 
    if(hmap.containsKey(prefix - k)){
    count += hmap.get(prefix -k);
    }
    hmap.put(prefix,hmap.getOrDefault(prefix,0)+1);
    }
    return count;
    }
}
