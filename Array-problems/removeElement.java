import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int ptr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=val){
                nums[ptr]=nums[i];
                ptr++;
            }
        }
        return ptr;
    }
}
public class removeElement
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution s1=new Solution(); 
        int[]arr={0,0,1,3,4,2,5,2,6,7};
        int k = 2;
        int ans = s1.removeElement(arr,k);
        System.out.println(ans);

    }
}