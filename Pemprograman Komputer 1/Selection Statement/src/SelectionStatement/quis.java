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
public class quis {
  public static void main(String[] args) {
        double[] nilai = {10, 50, 60, 75, 95};

        for (int i = 0; i < nilai.length; i++) {
            if ((nilai[i] >= 81.0) && (nilai[i] <= 100)) {
                System.out.println(nilai[i]+"Nilai akhir kamu = A ");
            } else if ((nilai[i] >= 69) && (nilai[i] <= 80.99)) {
                System.out.println(nilai[i]+"Nilai akhir kamu = B ");
            } else if ((nilai[i] >= 60) && (nilai[i] <= 68.99)) {
                System.out.println(nilai[i]+"Nilai akhir kamu = C ");
            } else if ((nilai[i] >= 49) && (nilai[i] <= 59.99)) {
                System.out.println(nilai[i]+"Nilai akhir kamu = D ");
            } else if ((nilai[i] >= 0) && (nilai[i] <= 48.99)) {
                System.out.println(nilai[i]+"Nilai akhir kamu = E ");
            } else {
                System.out.println("EROR");
            }
        }

    }
}
