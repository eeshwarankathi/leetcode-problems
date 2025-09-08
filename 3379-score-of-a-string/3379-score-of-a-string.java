class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i = 0;i<s.length()-1;i++) {
            score += getdiff((int) s.charAt(i), (int)s.charAt(i+1));
        }
        return score;
    }

    private int getdiff(int i, int j) {
        if (i > j) return (i-j);
        return (j-i);
    }
}