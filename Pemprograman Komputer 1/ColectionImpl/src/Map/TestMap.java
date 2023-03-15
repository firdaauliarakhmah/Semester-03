package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author firda
 */
public class TestMap {
    public static void main(String[] args) {
        Map machine = new HashMap();
        machine.put("HONDA", 21);
        machine.put("YAMAHA", 25);
        machine.put("KAWASAKI", 17);
        machine.put("KALEX", 40);
        System.out.println("Berhasil menambahan 4 objek");
        System.out.println("Jumlah elemen dalam Map : " + machine.size());
        Iterator iterator = machine.keySet().iterator();
        while (iterator.hasNext()){
            Object elemen = iterator.next();
            System.out.println(elemen);
        }
        System.out.println();
        System.out.println("Mencari elemen dalam Map dengan kunci 'HONDA'");
        String searchKey = "HONDA";
        if(machine.containsKey(searchKey)){
            System.out.println("Ditemukan : " + machine.get(searchKey));
        }
        System.out.println("Menghapus semua elemen dalam Map");
        machine.clear();
        System.out.println("Jumlah elemen dalam Map : " + machine.size());
    }
}
