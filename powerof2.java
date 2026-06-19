import java.util.Scanner;

public class powerof2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        int number = sc.nextInt();
        boolean result = isPowerTwo(number);
        if(result==true) System.out.println(" Yes");
        else System.out.println("no");
    }
     public static boolean isPowerTwo(int n){
        if(n<=0) return false;
        else {
            while(n%2==0){
                n/=2;
            }
            if(n==1) return true;
            if(n==0) return false;
        }
        return false;
    }

}