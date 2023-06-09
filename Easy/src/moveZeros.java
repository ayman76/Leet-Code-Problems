
public class moveZeros {
    public void moveZeroes(int[] nums) {
        int k = 0;
        while (k < nums.length) {
            if (nums[k] == 0)
                break;
            k++;
        }

        int i = k, j = k + 1;

        while (i < nums.length && j < nums.length) {
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
            j++;
        }
    }

}