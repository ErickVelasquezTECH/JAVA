package org.example.PC.Excercises.whileExercises;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Dime un numero");
        int n1=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Quieres seguir?");
        String answer=scanner.nextLine();
        while (answer.contains("S")|| answer.contains("s")){
            System.out.println("Dime un numero");
            n1=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Quieres seguir?");
            answer=scanner.nextLine();
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
