package org.example.PC.Excercises.variablesExercises;
import java.util.Scanner;
public class Ej2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un nominador");
        Double nominator = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Dime un demoninador");
        Double denominator = scanner.nextDouble();
        scanner.nextLine();
        Double division = nominator/denominator;
        System.out.println(division);
    }
}
