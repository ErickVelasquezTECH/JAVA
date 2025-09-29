package org.example.PC.Excercises.whileExercises;

import java.util.Scanner;

public class Ej {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        int numb=scanner.nextInt();
        scanner.nextLine();
        for (int i=1; i<=numb; i++){
            System.out.print(numb);
        }
    }
}
