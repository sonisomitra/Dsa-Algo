class Solution {
    public int findMaxLength(int[] nums) {
    HashMap<Integer,Integer> hmap = new HashMap<>();
    hmap.put(0,-1);

    int prefix =0;
    int maxL = 0; 
    for(int i=0;i<nums.length;i++){
    if(nums[i]==0){
        prefix--;
    }   
    else{
    prefix++;
    }
    if(hmap.containsKey(prefix)){
        int length = i-hmap.get(prefix);
        maxL = Math.max(maxL,length);
    }
    else{
        hmap.put(prefix,i);
    }
    }
    return maxL;
}
}
