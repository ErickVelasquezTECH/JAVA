package org.example.PC.Excercises.whileExercises;
import java.util.Scanner;
public class Ej7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime un numero");
        int numb1=scanner.nextInt();
        scanner.nextLine();
        int sum=0;
        while(numb1!=0){
            System.out.println("Dime un numero para sumar, escribe 0 para finalizar");
            numb1=scanner.nextInt();
            sum=sum+numb1;
        }
        System.out.println("La suma de todos los numeros es: "+sum);
    }
}
