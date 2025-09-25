package org.example.PC.Excercises.whileExercises;
import java.util.Scanner;
public class Ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime cuantos numeros vas a introducir");
        int counter = scanner.nextInt();
        scanner.nextLine();
        int media = 0;
        while (counter < 1) {
            System.out.println("Introduce un numero mayor o igual a 1");
            counter = scanner.nextInt();
        }
        for (int i = 0; i<counter; i++) {
            System.out.println("Dime el numero");
            int number1 = scanner.nextInt();
            scanner.nextLine();
            media = media + number1;
        }
        System.out.println("La media es: "+media);
    }
}
