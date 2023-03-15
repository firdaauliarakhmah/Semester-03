/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Lenovo
 */
public class Test {
    public static void main(String[] args) {
        Object[][] data = new Object[3][4];
        data[0][0] = 1;
        data[0][1] = "Bahri Kamal";
        data[0][2] = "Bagian Administrasi Umum";
        data[0][3] = 7500000;
        
        data[1][0] = 2;
        data[1][1] = "Teeven";
        data[1][2] = "IT"; //(index 1 indexs kolom 2)
        data[1][3] = 2500000;
        
        data[2][0] = 3;
        data[2][1] = "Ari";
        data[2][2] = "Keuangan dan pajak";
        data[2][3] = 1500000;
        
        //bagian [] depan data ke-brapa || ada brapa data ? //baris 1 index2
        //bagian [] kolomnya secara utuh
        
        Object[][] data1 = {
            {1,"kamal","Bau",7500000},
            {2,"tipen","IT",2500000}, //(index ke-1, indexs kolom 2)
            {3,"ari","Bakeu",150000}
        };
        
    }
}
