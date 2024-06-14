class Solution
{
    static String armstrongNumber(int n)
    {
        String s = Integer.toString(n);
        int sum = 0,i = 0;
        while(i<s.length())
        {
            sum+=Math.pow(Character.getNumericValue(s.charAt(i)),3);
            i++;
        }
        if(sum == n)
        return "true";
        else return "false";
    }
}
