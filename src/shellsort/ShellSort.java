package shellsort;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 3, 7, 10, 8, 9, 6};
        for (int step = arr.length / 2; step > 0; step /= 2) {
            for (int i = step; i < arr.length; i++) {
                for (int j = i - step; j >= 0; j -= step) {
                    if (arr[j] > arr[j + step]) {
                        int t = arr[j];
                        arr[j] = arr[j + step];
                        arr[j + step] = t;
                    }
                }
            }
        }
        for (int x :
                arr) {
            System.out.println(x);
        }
    }
}
