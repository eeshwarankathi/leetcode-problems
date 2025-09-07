class Solution {
    public int[] sumZero(int n) {
        int[] nums = new int[n];
        int j = n%2;
        if(j == 1) {
            nums[0] = 0;
        }
        int max = n/2;
        for(int i = 1;i<=max;i++) {
            nums[j++] = -1 * i;
            nums[j++] = i;
        }
        return nums;
    }
}