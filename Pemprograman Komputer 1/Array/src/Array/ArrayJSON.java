/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Lenovo
 */
public class ArrayJSON {
    public static void main (String args[]){
        //cara 1 cara kurang efektif
        Object[][] data = { 
            {"john"},
            {"berlin"},
            {"teacher"},
            {5000000}
        };
        
        //cara 2 tanpa harus multidimensi
        Object[] data1 = {
            "john",
            "berlin",
            new Object[]{"audi","bmw"},
            "techer",
            5000000
        };
        
//        System.out.println(data1[0][2][1]); --> cara print bmw
//        array -- > suatu hal yg berharga bagi anak ti
    }
}
