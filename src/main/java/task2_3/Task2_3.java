package task2_3;

import java.util.*;

public class Task2_3 {
    static boolean fuzzySearch(String sample, String text) {
        ArrayList<Character> characterSet = new ArrayList<>();
        int firstTextChar = 0;
        int firstSampleChar = 0;
        while (firstSampleChar < sample.length() && firstTextChar < text.length()) {
            if (sample.charAt(firstSampleChar) == text.charAt(firstTextChar)) {
                characterSet.add(text.charAt(firstTextChar));
                firstSampleChar++;
                firstTextChar++;
            } else if (sample.charAt(firstSampleChar) != text.charAt(firstTextChar)) {
                firstTextChar++;
            }
        }
        if (characterSet.size() == sample.length()) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel")); // true
        System.out.println(fuzzySearch("cwhl", "cartwheel")); // true
        System.out.println(fuzzySearch("cwhee", "cartwheel")); // true
        System.out.println(fuzzySearch("cartwheel", "cartwheel")); // true
        System.out.println(fuzzySearch("cwheeel", "cartwheel")); // false
        System.out.println(fuzzySearch("lw", "cartwheel")); // false
    }
}
