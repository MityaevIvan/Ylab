package task1;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int [][] array = new int[5][5];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = generateRandomNumber();
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Max value is: " + maxValue(array));
        System.out.println("Min value is: " + minValue(array));
        System.out.println("Average value is: " + avgValue(array));
    }

    public static int generateRandomNumber(){

        int result;
        int min = 10;
        int max = 1994;
        return (new Random().nextInt((max - min) + min));
    }

    public static int maxValue(int [][] array){
        int max = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int minValue(int [][] array){
        int min = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] < min){
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public static int avgValue(int [][] array){
        int average;
        int sum = 0;
        int n = 25;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                sum = sum + array[i][j];
            }
        }
        average = sum/n;
        return average;
    }
}
