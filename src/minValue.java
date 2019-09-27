public class minValue {
    public static int findMind(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr1 = {13, 3, 5, 2, 1, -5, 9, 0};
        System.out.println("Min value : " + arr1[findMind(arr1)]);
    }
}
