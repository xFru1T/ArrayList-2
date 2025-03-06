import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print length array: ");
        int len1 = scanner.nextInt();
        int[] array1 = new int[len1];
        System.out.print("Print the number array: ");
        for (int i = 0; i < len1; i++) {
            array1[i] = scanner.nextInt();
            }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : array1) {
            arr.add(num);
            }
        Integer first = Integer.MIN_VALUE;
        Integer second = Integer.MIN_VALUE;
        for (Integer number : arr) {
            if (number > first) {
                second = first;
                first = number;
                }
            else
                if (number > second && number != first) {
                second = number;
                }
            }
        if (second != Integer.MIN_VALUE) {
            System.out.println("2nd max number: " + second);
            }
        }
    }


