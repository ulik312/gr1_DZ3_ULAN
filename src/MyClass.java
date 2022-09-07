public class MyClass {
    public static void main(String args[]) {
        firstTask();
        secondTask();
    }

    private static void firstTask() {
        double[] d = {8, -2, -4, 2, 3, 6, 8, -2, -4, 2, 3, 6, 8, -2, -4, 2, 3, 6};
        int counter = 0;
        double sum = 0;
        boolean isFoundFirstNegative = false;
        for (double i : d) {
            if (i < 0) isFoundFirstNegative = true;
            if (i > 0 && isFoundFirstNegative) {
                sum += i;
                counter++;
            }
        }
        System.out.println(sum / counter);
    }

    private static void secondTask() {
        int[] arr = {8, -2, -4, 2, 3, 6, 8, -2, -4, 2, 3, 6, 8, -2, -4, 2, 3, 6};
        for (int i = 0; i < 15; i++) {
            int minInd = i;
            for (int j = i + 1; j < 15; j++) {
                if (arr[minInd] > arr[j]) {
                    minInd = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = tmp;
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(arr[i]);
        }
    }
}