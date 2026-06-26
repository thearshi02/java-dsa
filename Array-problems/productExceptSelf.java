class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] right = new int[n];
        int pro=1;
        for(int i=n-1;i>=0;i--){
            pro=pro*nums[i];
            right[i]=pro;
        }
        int[] ans=new int[n];
        int left=1;
        for(int i=0;i<n-1;i++){
            int val =left*right[i+1];
            ans[i]=val;
            left=left*nums[i];
        }
        ans[n-1]=left;
        return ans;
    }
}
public class productExceptSelf{
    public static void main(String[] args) {
        Solution s1=new Solution();
        int[] arr={1,2,3,4,5};
        int [] result=new int[arr.length];
        result=s1.productExceptSelf(arr);
        System.out.println(result);
    }
}

