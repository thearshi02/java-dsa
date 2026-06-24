import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
         int range=nums.length;
         int actualsum = (range*(range+1))/2;
         int current=0;
         for(int i=0;i<range;i++){
            current=current+nums[i];

         }
         int ans = actualsum-current;
         return ans;
    }

}
public class missingNumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution s1=new Solution(); 
        int[]arr={0,1,3,4,5,6};
        int ans = s1.missingNumber(arr);
        System.out.println(ans);

    }
}