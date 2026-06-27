class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1;
        int smax=-1;
        int maxind=0;
        for(int i=0;i<=nums.length-1; i++){
            if(max<nums[i]){
                smax=max;
                max=nums[i];
                maxind=i;
            }
            else if(smax<nums[i]){
                smax=nums[i];
            }
        }
        if(smax*2<=max){
            return maxind;
        }
        else return -1;
    }
}
public class dominantindex
{
    public static void main(String[] args) {
        Solution s1=new Solution(); 
        int[]arr={1,3,4,5,6};
        int ans = s1.dominantIndex(arr);
        System.out.println(ans);

    }
}