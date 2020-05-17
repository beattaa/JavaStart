package zajecia11.zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumPositiveNumbers {
    public static void main(String[] args) {
        List<Integer> listWithNumbers = getListWithNumbers();
        displayReverseElements(listWithNumbers);
        displaySum(listWithNumbers);
        System.out.println("Sum of numbers in array: " + countSumOfNumbersInArray(listWithNumbers));
        System.out.println("Max value is " + getMaxValue(listWithNumbers));
        System.out.println("Min value is " + getMinValue(listWithNumbers));
    }

    public static List<Integer> getListWithNumbers() {
        List<Integer> listWithNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program zapisujacy liczby dodatnie do listy. \n Podanie liczby ujemnej konczy zapisywanie.");
        do {
            System.out.print("Podaj liczbe: ");
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            listWithNumbers.add(number);
        }
        while (true);
        return listWithNumbers;
    }

    public static void displayReverseElements(List<Integer> listWithNumbers) {
        System.out.print("[");
        for (int i = listWithNumbers.size() - 1; i >= 0; i--) {
            System.out.print(listWithNumbers.get(i) + " ");
        }
        System.out.print("] \n");
    }

    public static void displaySum(List<Integer> listWithNumbers) {
        String s = "";
        for (int i = 0; i < listWithNumbers.size() - 1; i++) {
            s += listWithNumbers.get(0) + "+";
        }
        s += listWithNumbers.get(listWithNumbers.size() - 1) + "=";
        System.out.println(s + countSumOfNumbersInArray(listWithNumbers));
    }

    public static int countSumOfNumbersInArray(List<Integer> listWithNumbers) {
        int sum = 0;
        for (int i = 0; i < listWithNumbers.size(); i++) {
            sum += listWithNumbers.get(i);
        }
        return sum;
    }

    public static int getMaxValue(List<Integer> listWithNumbers) {
        int max = 0;
        if (listWithNumbers.size() > 0) {
            max = listWithNumbers.get(0);
            for (int i = 1; i < listWithNumbers.size(); i++) {
                if (max < listWithNumbers.get(i)) {
                    max = listWithNumbers.get(i);
                }
            }
        }
        return max;
    }

    public static int getMinValue(List<Integer> listWithNumbers) {
        int min = 0;
        if (listWithNumbers.size() > 0) {
            min = listWithNumbers.get(0);
            for (int i = 1; i < listWithNumbers.size(); i++) {
                if (min > listWithNumbers.get(i)) {
                    min = listWithNumbers.get(i);
                }
            }
        }
        return min;
    }
}
