package org.example.PC.Excercises.switchExercises;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime una palabra de 8 caracteres");
        String word=scanner.nextLine();
        switch (word.length()){
            case 8:
                System.out.println("Es valido");
                break;
            default:
                System.out.println("No valido");
                break;
        }
    }
}
