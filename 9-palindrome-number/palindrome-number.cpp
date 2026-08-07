class Solution {
public:
    bool isPalindrome(int x) {
        int temp = x; long long rev=0;
        if(x<0)
        return 0;
        while(temp>0)
        {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp = temp/10;
        }
        if(rev == x)
            return true;
        return false;
        }
};