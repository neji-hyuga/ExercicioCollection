import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio3 {

    public static void main(String[] args) {

        Set<Integer> conjuntoInteiros = new HashSet<>();
        conjuntoInteiros.add(4);
        conjuntoInteiros.add(8);
        conjuntoInteiros.add(12);
        conjuntoInteiros.add(30);

        Prova prova = new Prova();
        prova.somaTotal(conjuntoInteiros);

        System.out.println(prova.getTotal());

    }
}
