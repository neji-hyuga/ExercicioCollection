import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio2 {

    public static void main(String[] args) {

        List<Integer> numLista = new ArrayList<>();
        numLista.add(1);
        numLista.add(5);
        numLista.add(5);
        numLista.add(6);
        numLista.add(7);
        numLista.add(8);
        numLista.add(8);
        numLista.add(8);

        System.out.println(numLista);

        System.out.println("*** diferença lista e conjunto ***");

        Set<Integer> numConjunto = new HashSet<>();
        numConjunto.add(1);
        numConjunto.add(5);
        numConjunto.add(5);
        numConjunto.add(6);
        numConjunto.add(7);
        numConjunto.add(8);
        numConjunto.add(8);
        numConjunto.add(8);

        System.out.println(numConjunto);

    }
}
