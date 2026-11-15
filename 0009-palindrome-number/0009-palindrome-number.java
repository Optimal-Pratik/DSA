class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int rev = 0;
        int temp = x;
        while(temp != 0)
        {
            int rem = temp % 10;

            if(rev > Integer.MAX_VALUE / 10 ||
              (rev == Integer.MAX_VALUE / 10 && rem > 7))
                return false;

            rev = rev * 10 + rem;
            temp /= 10;
        }
        if(rev == x)
            return true;
        else
            return false;
    }
}