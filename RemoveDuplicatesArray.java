class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        for (int r:nums){
            if (nums[l]!=r){
                l++;
            nums[l] = r;
            }
        }
    return l+1;
    }
}
