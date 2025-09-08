class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int i = 0, j = x;
        while(j > 0) {
            i = i * 10;
            i = i + (j%10);
            j = j/10;
        }
        return i == x;
    }
}