class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int st=0;
        int end=nums.length-1;
        int ptr=nums.length-1;

        while(st<=end){
            int ss= nums[st]*nums[st];
            int es =nums[end]*nums[end];

            if(ss>es){
                ans[ptr]=ss;
                st++;
            }
            else{
                ans[ptr]=es;
                end--;
            }
            ptr--;
        }
        return ans;
    }
}
public class sortedSquares{
    public static void main(String[] args) {
        Solution s1= new Solution();
        int[] arr1 = {-7,-4,-2,0,2,4,5,6,8,9};
        int[] ans=new int[arr1.length];
        ans = s1.sortedSquares(arr1);
        System.out.println(ans);

    }
}