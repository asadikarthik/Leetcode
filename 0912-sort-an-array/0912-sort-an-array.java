class Solution {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        // Sort left half
        mergeSort(nums, low, mid);

        // Sort right half
        mergeSort(nums, mid + 1, high);

        // Merge both sorted halves
        merge(nums, low, mid, high);
    }

    private void merge(int[] nums, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        // Compare both halves
        while (i <= mid && j <= high) {

            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Remaining left elements
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Remaining right elements
        while (j <= high) {
            temp[k++] = nums[j++];
        }

        // Copy back
        for (int x = 0; x < temp.length; x++) {
            nums[low + x] = temp[x];
        }
    }
}