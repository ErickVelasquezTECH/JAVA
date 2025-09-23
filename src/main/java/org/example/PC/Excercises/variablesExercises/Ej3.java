package org.example.PC.Excercises.variablesExercises;
import java.util.Scanner;
public class Ej3 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tell me a first number");
        int number1=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dime el second number");
        int number2=scanner.nextInt();
        scanner.nextLine();
        int multiplication=number1*number2;
        System.out.println(multiplication);
    }
}
