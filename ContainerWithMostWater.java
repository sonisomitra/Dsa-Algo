class Solution {
    public int maxArea(int[] height) {
    int start = 0;
    int end = height.length-1;
    int result = 0;
    while (start<end){
        int width = end - start;
        int currarea = Math.min(height[start] , height[end]) * width;
        result = Math.max(result,currarea); 
    if(height[start]<height[end]){
        start++;
    }
    else{
        end--;
    }
    }    
    return result;
    }
}
