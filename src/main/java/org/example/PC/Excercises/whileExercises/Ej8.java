package org.example.PC.Excercises.whileExercises;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=0, positives=0, negatives=0;
        int count0=0, countPositives=0, countNegatives=0;
        while (count!=10){
            System.out.println("Dime 10 numeros");
            int numb=scanner.nextInt();
            scanner.nextLine();
            if (numb>0){
                positives+=numb;
                countPositives++;
            } else if (numb<0){
                negatives+=numb;
                countNegatives++;
            } else {
                count0++;
            }
            count++;
        }
        if (countPositives>0){
            System.out.println("La media de los positivos es: "+ positives/countPositives);
        } else {
            System.out.println("No hay positivos");
        }
        if (countNegatives>0){
            System.out.println("La media de los negativos es: "+ negatives/countNegatives);
        } else {
            System.out.println("No hay negativos");
        }
        if (count0>0){
            System.out.println("La cantidad de 0 son: "+count0);
        } else {
            System.out.println("No hay ceros");
        }


    }
}
