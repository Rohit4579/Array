public class removeElements {

    public int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {

                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        removeElements solution = new removeElements();

        int[] nums = {1, 2, 2, 3, 4, 5, 2, 7};
        int val = 2;

        int k = solution.removeElement(nums, val);

        System.out.println("Number of remaining elements: " + k);

        
        System.out.print("Remaining array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}