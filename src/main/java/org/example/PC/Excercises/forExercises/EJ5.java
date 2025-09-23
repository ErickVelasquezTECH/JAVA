package org.example.PC.Excercises.forExercises;
import java.util.Scanner;
public class EJ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un año");
        int numb1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dime un segundo año");
        int numb2 = scanner.nextInt();
        scanner.nextLine();
        if (numb1 < numb2) {
            for (int i = numb1; i < numb2; i++) {
                if (i % 4 == 0 && (i % 100 != 0)) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = numb2; i < numb1; i++) {
                if (i % 4 == 0 && (i % 100 != 0)) {
                    System.out.println(i);

                }

            }
        }
    }
}