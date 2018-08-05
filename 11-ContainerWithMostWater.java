class Solution {
    public int maxArea(int[] height) {
        int r = height.length-1;
        int l = 0;
        int maxarea = 0;
        while(l<r){
            int area = Math.min(height[l],height[r])*(r-l);
            maxarea = Math.max(maxarea,area);
            if(height[l]<height[r])
                l++;
            else 
                r--;
        }
        return maxarea;
    }
}