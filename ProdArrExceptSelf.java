class Solution {
    public int[] productExceptSelf(int[] nums) {
    int lprod  = 1;
    int rprod = 1;
    int n = nums.length;
    int[] result = new int[n];
    for(int i=0;i<n;i++){
        result[i]=lprod;
        lprod *= nums[i];
    }
    for(int i=n-1;i>=0;i--){
        result[i] *= rprod;
        rprod *= nums[i];
    }
    return result;
    }
}
