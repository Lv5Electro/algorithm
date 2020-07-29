package selectsort;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 3};
        for (int i = 0; i < arr.length; i++) {
            int min = 1000000;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for (int x :
                arr) {
            System.out.println(x);
        }
    }
}
