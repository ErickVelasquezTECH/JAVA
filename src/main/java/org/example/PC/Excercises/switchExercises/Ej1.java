package org.example.PC.Excercises.switchExercises;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Dime un valor");
        int n1=scanner.nextInt();
        scanner.nextLine();
        switch (n1){
            case 1,2,3,4,5:
                System.out.println("Buenas noches");
                break;
            case 6,7,8,9,10,11,12:
                System.out.println("Buenos dias");
                break;
            case 13,14,15,16,17,18,19,20:
                System.out.println("Buenos tardes");
                break;
            case 21,22,23:
                System.out.println("Buenos noches");
                break;
            default:
                System.out.println("Hora ivnalida");
                break;
        }
    }
}
