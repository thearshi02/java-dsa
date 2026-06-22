import java.util.Scanner;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol =new int[2];
        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    sol[0]=i;
                    sol[1]=j;
                    break;
                }
            }
        }
        return sol;
    }   
}
public class twoSum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution s1=new Solution();
        System.out.println("enter the target");
        int n = sc.nextInt();
        int arr[]=new int[10];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        int result[] = s1.twoSum( arr, n); 
        System.out.println(result);
        


    }
}