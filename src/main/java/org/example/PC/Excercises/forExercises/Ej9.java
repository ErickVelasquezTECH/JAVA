package org.example.PC.Excercises.forExercises;
import java.util.Scanner;
public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Dime un numero mayor a 1");
        int numb1=scanner.nextInt();
        scanner.nextLine();
        boolean isprime=true;
        if (numb1>0) {
            for (int i = 2; i < numb1; i++) {
                if (numb1 % i == 0) {
                    isprime = false;
                }
            }
        }
        if (numb1<0){
            System.out.println("No existe primo negativo");

        } else if (isprime) {
            System.out.println("Es primo");
        } else {
        System.out.println("No es primo");
    }

    }
}
