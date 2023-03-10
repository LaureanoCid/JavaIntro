package javaIntroEjAp;

import java.util.Scanner;

public class Holis {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int val =2;
        Integer[][] mat = new Integer[val][val];
    
        for (int i = 0 ; i<val ; i++) {
            for (int j = 0 ; j<val ; j++) {
                System.out.println("Ingresa valor en la posicion "+ (1+i)+ " " +(1+j));
                mat[i][j] = leer.nextInt();
            }
        }
        System.out.println(" MATRIZ PRINCIPAL ");
        for (int i = 0 ; i<val ; i++) {
            for (int j = 0 ; j<val ; j++) {
             System.out.print(String.format(" | %2d", mat[i][j], " | "));
            }
            System.out.println(" | ");
        }
        System.out.println(" MATRIZ TRANSPUESTA ");
        for (int i = 0 ; i<val ; i++) {
            for (int j = 0 ; j<val ; j++) {
             System.out.print(String.format(" | %2d", mat[j][i], " | "));
            }
            System.out.println(" | ");
        }


    }    
}
