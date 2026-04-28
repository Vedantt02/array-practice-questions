// 34. Count the number of elements greater than a given number.

public class que34 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 2};
        int key = 3;

        int count = 0;

        for (int i : arr) {
            if (i > key) count++;
        }

        System.out.println(count);
    }
}