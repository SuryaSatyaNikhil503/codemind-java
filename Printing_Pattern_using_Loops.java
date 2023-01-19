import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int top = 0;
        int down = 2*n-2;
        int left = 0;
        int right = 2*n-2;
        for(int i=0 ; i<2*n-1 ; i++)
        {
            for(int j=0 ; j<2*n-1 ; j++)
            {
                int min_dis = Math.min(Math.min(i-top,down-i),Math.min(j-left,right-j));
                System.out.print(n-min_dis+" ");
            }
            System.out.println();
        }
    }
}