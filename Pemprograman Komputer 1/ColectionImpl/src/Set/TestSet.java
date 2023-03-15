/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author firda
 */
public class TestSet {
    public static void main(String[] args) {
        Set Set = new LinkedHashSet();
        Set.add("Elemen 1");
        Set.add("Elemen 2");
        Set.add("Elemen 3");
        Set.add("Elemen 4");
        System.out.println("Sukses menambah 4 objek ke dalam set");
        System.out.println("Menapilkan semua objek dalam set");
        Iterator iterator = Set.iterator();
        while (iterator.hasNext()){
            Object elemen =iterator.next();
            System.out.println("\t" + elemen);
        }
        System.out.println("Menghapus 'Elemen 3' dari set");
        Set.remove("Elemen 3");
        System.out.println("'Elemen 3' telah dihapus dari set");
        System.out.println("Menambahkan objek 'Elemen 1' ke dalam set");
        Set.add("Elemen 1");
        System.out.println("Menampilkan semua objek dalam set");
        iterator = Set.iterator();
        while (iterator.hasNext()){
            Object elemen =iterator.next();
            System.out.println("\t" + elemen);
        }
    }
}
