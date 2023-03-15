/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SelectionStatement;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Example3 {
    public static void main(String[] args) {
//        Object[] data = {41,42,55,65,75,85};
//        for (Object o : data) {
//            System.out.println(o);
//        }
//        
//        for (int i = 0; i < data.length; i++) { //looping inetmental tp klo ini harus tau indexnya
//            System.out.println(data[i]);
//        }
//        int i, j;
//        for(i=1; i<=5; i++){
//        for(j=1; j<=i; j++){
//            /*
//            */
//            System.out.println("*");
//        }
//            System.out.println("");
//        }
      
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print('*');
            }

            System.out.println();

        }
    }
}
