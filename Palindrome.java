import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int start = 0;
        int end = str.length()-1;
        while(start < end)
        {
            if(str.charAt(start) != str.charAt(end))
            {
                System.out.println("False");
                return;
            }
            start++;
            end--;
        }
        System.out.println("True");
    }
}