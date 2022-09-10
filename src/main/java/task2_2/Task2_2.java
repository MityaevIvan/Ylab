package task2_2;

public class Task2_2 {

    public static void findSumByNumberInArray(int[] array, int number) {
        int sum = 0;
        int n = 0;
        int m = 1;
        while (n != m) {
            sum = array[n] + array[m];
            if (sum == number) {
                System.out.println("[" + array[n] + ", " + array[m] + "]");
                break;
            }
            for (int i = m; i < array.length; i++) {
                sum = array[n] + array[i];
                if (sum == number) {
                    System.out.println("[" + array[n] + ", " + array[i] + "]");
                    return;
                }
            }
            if (sum != number) {
                n++;
                m++;
            }
            if (m >= 4) {
                break;
            }
        }
        System.out.println("array doesn't contain such pair");

    }

    public static void main(String[] args) {
        int[] array = {3, 4, 2, 7};
        findSumByNumberInArray(array, 10);
    }

}
