import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cntDigi = Integer.toString(N).length();
        int sum = 0;
        int x = N;
        while(x != 0)
        {
            int rem = x%10;
            sum = (int) (sum + Math.pow(rem , cntDigi--));
            x = x/10;
        }
        System.out.println(sum == N ? "True" : "False");
    }
}