package Stack;

import java.util.Stack;

/**
 *
 * @author firda
 */
public class TestStack {
    public static void main(String[] args) {
        Stack tumpukan = new Stack();
        System.out.println("Menumpuk 10 buku");
        for (int i = 1; i <= 10; i++){
            tumpukan.add("Buku " + 1);
        }
        System.out.println("Tumpukan buku sekarang : ");
        for (int i = tumpukan.size()-1; i >= 0; i--){
            System.out.println(tumpukan.elementAt(i));
        }
        System.out.println("Buku paling bawah : " + tumpukan.firstElement());
        System.out.println("Buku paling atas : " + tumpukan.peek());
        System.out.println("Ambil buku paling atas : " + tumpukan.pop());
        System.out.println("Tumpukan buku sekarang : ");
        for (int i = tumpukan.size()-1; i>=0; i--) {
            System.out.println(tumpukan.elementAt(i));
        }
    }
}
