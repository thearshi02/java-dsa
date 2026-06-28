class Solution {
    public int maxArea(int[] height) {
        int st =0;
        int end= height.length-1;
        int maxcap =0;
        while(st<end){
            int h = Math.min(height[st], height[end]);
            int width = end-st;
            int currcap= h*width;
            maxcap = Math.max(currcap,maxcap);
            if(height[st]<height[end]){
                st++;
            }  
            else end--;
           }
           return maxcap;
    }
}
public class maxwater {
    public static void main(String[] args){
        Solution s1= new Solution(); 
        int arr[] ={4,7,3,8,1};
        int result = s1.maxArea(arr);
        System.out.println(result);

    }
}