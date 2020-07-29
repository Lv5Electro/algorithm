package insertsort;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 3};
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            int j;
            for (j = i - 1; j >= 0 && insertVal < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = insertVal;
        }
        for (int x :
                arr) {
            System.out.println(x);
        }
    }

}
