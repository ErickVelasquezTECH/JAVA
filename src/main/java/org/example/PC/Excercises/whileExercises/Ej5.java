//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.PC.Excercises.whileExercises;

import java.util.Random;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el numero entre 1 al 100");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        Random r = new Random();
        int secret = r.nextInt(100);

        while(number1 != secret) {
            if (number1 < secret) {
                System.out.println("El numero es mayor");
            } else {
                System.out.println("El numero es menor");
            }

            System.out.println("Adivina el numero entre el 1 al 100");
            number1 = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("EXACTO! es " + secret);
    }
}
