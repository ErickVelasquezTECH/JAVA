package org.example.PC.Excercises.variablesExercises;
import java.util.Scanner;
public class Ej4 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime un numero");
        int number1 =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dime un segundo numero");
        int number2 =scanner.nextInt();
        scanner.nextLine();
        boolean resultant= number1==number2;
        System.out.println(resultant);
    }
}
