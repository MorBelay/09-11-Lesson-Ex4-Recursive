
// מגישים: בלייב מור וחיים אשרף 50/5

public class Ex4 {

    // Calculate the sum of numbers divisible by 10
    public static int sumDivisibleBy10(int[] arr, int size) {

        // Check if the array and size are valid
        if (arr == null || size < 0 || size > arr.length) {
            return 0;
        }

        // Stop when there are no more elements
        if (size == 0) {
            return 0;
        }

        // Add the number if it is divisible by 10
        if (arr[size - 1] % 10 == 0) {
            return arr[size - 1] + sumDivisibleBy10(arr, size - 1);
        }

        return sumDivisibleBy10(arr, size - 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 7, 30};

        System.out.println(sumDivisibleBy10(arr, arr.length));
    }
}

// סיבוכיות: O(n)