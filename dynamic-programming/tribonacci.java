import java.util.Scanner;
class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        else if (n==1) return 1;
        else if(n==2) return 1;
        else
        {
        int first = 0;
        int second =1;
        int third =1;
        for (int i=1;i<=n;i++)
        {
            int fourth= first+second+third;
            first=second;
            second=third;
            third=fourth;
        }
        return first;
        } 
    }
}
public class tribonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution s1 =new Solution();
        System.out.println("enter a number");
        int number=sc.nextInt();;
        int result=s1.tribonacci(number);
        System.out.println("result="+result);
    }
}
