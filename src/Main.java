import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        listaNumeri();
    }
    public static void listaNumeri() {
        Set<Integer> numeri = new HashSet<>(Arrays.asList(1,2,3,4));

        Integer nuovoNumero = 5;

        numeri.add(nuovoNumero);

        if (numeri.contains(nuovoNumero)) {
            System.out.println("Il " + nuovoNumero + " e nel HashSet");
        } else {
            System.out.println("Il " + nuovoNumero + " non e nel HashSet");
        }

        for(Integer elementi: numeri) {
            System.out.println("Elementi: " + elementi);
        }
    }
}