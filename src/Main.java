public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {1, 1, 2};

        int k = solution.removeDuplicates(nums); // Calls your implementation
        System.out.println(k);
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int arr = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] != nums[i]) {

                nums[arr] = nums[i];
                arr++;
            }
        }
        return arr;
    }
}