public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 1};
        System.out.println("2 3 4 5 1");
        cyclicallyRotateByTwo(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void cyclicallyRotateByTwo(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }
        for (int j = 0; j < 2; j++) {
            int temp = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
    }
}