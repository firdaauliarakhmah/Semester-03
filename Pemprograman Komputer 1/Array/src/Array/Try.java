/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Lenovo
 */
public class Try {
    public static void main(String[] args) {
        Object[][] data = { //tnpa harus multidimensi
            {1, "Bahri Kamal", "BAU", 750000},
            {2, "Teeven", "IT", 25000000},
            {3, "Ari", "Keuangan dan Pajak", 25000000}
        };
        for (int i = 0; i < data.length; i++) {
            System.out.println("NO: " + data[i][0]);
            System.out.println("Nama: " + data[i][1]);
            System.out.println("Departemen: " + data[i][2]);
            System.out.println("Salary: " + data[i][3]);
            System.out.println("==================");
           
        }
    }
}
