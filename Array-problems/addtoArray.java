import java.util.*; 
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans= new ArrayList<>();
        int p=num.length -1;
        int carry=0;
        while(p>=0 || k>0 || carry>0){
            int numval=0;
            if(p>=0){
                numval = num[p];
            }
            int d =k%10;
            int sum = numval +d+carry;
            int digit =sum%10;
            carry =sum/10;
            ans.add(digit);
            p--;
            k=k/10;
        }
        Collections.reverse(ans);
        return ans;
    }
}
public class addtoArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution s1=new Solution(); 
        int[]arr={3,5,4,6};
        int k = 567;
        List<Integer> ans = s1.addToArrayForm(arr,k);
        System.out.println(ans);

    }
}