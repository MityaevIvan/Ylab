package task2_2;

public class Task2_2 {

    public static void findSumByNumberInArray(int[] array, int number) {

        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] + array[j] == number){
                    System.out.println("[" + array[i] + ", " + array[j] + "]");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 2, 7};
        findSumByNumberInArray(array, 9);
    }

}
