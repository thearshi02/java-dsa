import java.util.Scanner;
class Solution
 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while(numBottles>=numExchange){
            int newBottles=numBottles/numExchange;
            int remaining = numBottles % numExchange;
            ans+=newBottles;
            numBottles=newBottles+remaining;
        }
      return ans;  
    }
}
public class waterBottle
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numbottles = sc.nextInt();
        int numexchange= sc.nextInt();
        Solution s1=new Solution();
        int result=s1.numWaterBottles( numbottles, numexchange); 
        System.out.println(result);

            }
}
