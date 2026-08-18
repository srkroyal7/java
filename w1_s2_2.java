class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                arr[index++] = num;
            }
        }
        for (int num : nums) {
            if (num % 2 != 0) {
                arr[index++] = num;
            }
        }
        return arr;
    }
}
