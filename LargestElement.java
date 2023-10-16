public class LargestElement {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 6, 1, 2, 10 };
        int large = arr[0];
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                large = arr[i];
            }
        }
        System.out.println("Largest element in given array is " + large);
    }
}