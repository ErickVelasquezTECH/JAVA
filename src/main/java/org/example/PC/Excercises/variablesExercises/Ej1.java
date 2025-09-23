package org.example.PC.Excercises.variablesExercises;
import java.util.Scanner;
public class Ej1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Dime un numero");
        Double number =scanner.nextDouble();
        scanner.nextLine();
        number++;
        number++;
        System.out.println(number);
    }
}
