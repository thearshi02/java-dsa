import java.util.Scanner;
class Solution {
    public int maxProduct(int[] nums) {
        int max=-1;
        int smax=-1;
        for(int i=0;i<nums.length;i++){
            if (nums[i]>max){
                smax=max;
                max = nums[i];
            }
            else if(smax<nums[i]){
                smax = nums[i];
            }
        }
        return (max-1)*(smax-1);
    }
}
public class maxProduct
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution s1=new Solution(); 
        int[]arr={3,5,4,6,9,7};
        int ans= s1.maxProduct(arr);
        System.out.println(ans);

    }
}