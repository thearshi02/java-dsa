import java.util.*;
class Solution {
    public int bulbSwitch(int n) {
        int count=0;
        int i=1;
        while(i*i<=n){
            count++;
            i++;
        }
        return count;
    }
}
public class bulbswitcher{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution s1=new Solution();
        System.out.println("enter the number of bulbs");
        int n = sc.nextInt();
        int result = s1.bulbSwitch(n); 
        System.out.println(result);

}
}