class Solution {
    public int longestConsecutive(int[] nums) {
    int n = nums.length;
    if(n==0){return 0;}
    int longest = 1;
    HashSet<Integer> hset = new HashSet<>();   
    for (int i=0;i<n;i++){
        hset.add(nums[i]);
    }
    for(int it:hset){
        if(!hset.contains(it-1)){
            int count = 1;
            int x = it;
        while(hset.contains(x+1)){
        x = x + 1;
        count = count + 1;   
        }
        longest = Math.max(longest,count);
        }
    }
    return longest;
    }
}
