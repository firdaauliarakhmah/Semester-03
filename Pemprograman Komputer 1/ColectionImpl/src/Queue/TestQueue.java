package Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author firda
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue antrian = new LinkedList();
        System.out.println("Total antrian saat ini : " + antrian.size());
        antrian.add("Antrian 1");
        antrian.add("Antrian 2");
        antrian.add("Antrian 3");
        System.out.println("Total Antrian : " + antrian.size());
        antrian.forEach((element) -> {
            System.out.println("\t" + element);
        });
        System.out.println("Antrian pertama adalah : " + antrian.element());
        System.out.println("Ambil dan hapus antrian pertama");
        antrian.poll();
        System.out.println("Antrian sekarang : ");
        antrian.forEach((element) -> {
            System.out.println("\t" + element);
        });
    }
}
