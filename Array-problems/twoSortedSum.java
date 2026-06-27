import java.util.*;
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans =new int[2];
        int st=0;
        int end=numbers.length-1;

        while(st<end){
            int sum = numbers[st] + numbers[end];

            if(sum==target){
                ans[0]=st+1;
                ans[1]= end+1;
                return ans;
            }
            else if(sum>target){
                end--;
            }
            else st++;
        }
        return ans;
    }
}
public class twoSortedSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution s1=new Solution();
        int[] arr = {2,3,4,5,6,7,8};
        System.out.println("enter the target");
        int n = sc.nextInt();
        int result[] = s1.twoSum( arr, n); 
        System.out.println(result);

}
}
