package Prep;

import java.util.Arrays;
import java.util.Scanner;

public class fakemarks {
    public static int findFakemark(int[] marks) {

        Arrays.sort(marks);
        return marks[marks.length-2];
    }

    public static void main(String[] args) {
        int[] marks = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Fake Marks are " + findFakemark(marks));
    }
}
