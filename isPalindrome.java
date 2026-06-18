import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int n = x;
        int rev=0;
        while(n>0){
            int d = n%10;
            rev = rev*10 +d;
            n = n/10;
        }
        if (rev==x) return true; 
        else return false; 
    }
}
public class isPalindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution s1 =new Solution();
        System.out.println("enter a number");
        int number=sc.nextInt();;
        boolean result=s1.isPalindrome(number);
        if (result==true) System.out.println("the number is palindrome");
        else System.out.println("the number is not palindrome");
    


        

      
    }
}

