import java.util.*;

public class Exercicio1 {

    public static void main(String[] args) {


        Map<Integer, String> loteriaDosSonhos = new HashMap<>();
        loteriaDosSonhos.put(0, "ovos");
        loteriaDosSonhos.put(1, "água");
        loteriaDosSonhos.put(2, "escopeta");
        loteriaDosSonhos.put(3, "cavalo");
        loteriaDosSonhos.put(4, "dentista");
        loteriaDosSonhos.put(5, "fogo");

        int max = 5;
        int min = 0;
        Random random = new Random();
        int randomInt = random.nextInt((max - min) + 1) + min;
        System.out.println("Numero aleatorio "+randomInt);

        System.out.println("**************************");

        for (Integer chave : loteriaDosSonhos.keySet()) {
            String loteria = loteriaDosSonhos.get(chave);
            System.out.println(chave + " " + loteria);

        }
        System.out.println("***************************");

        List<String> listaJoao = new ArrayList<>();
        listaJoao.add("Juan");
        listaJoao.add("Fissura");
        listaJoao.add("Maromba");

        List<String> listaMiguel = new ArrayList<>();
        listaMiguel.add("Night Watch");
        listaMiguel.add("Bruce Wayne");
        listaMiguel.add("Tampinha");

        List<String> listaMaria = new ArrayList<>();
        listaMaria.add("Wonder Woman");
        listaMaria.add("Mary");
        listaMaria.add("Marilene");

        List<String> listaLucas = new ArrayList<>();
        listaLucas.add("Lukinha");
        listaLucas.add("Jorge");
        listaLucas.add("George");

        Map<String, List<String>> listaApelidos = new HashMap<>(); //mapa com valor q recebe lista
        listaApelidos.put("João", listaJoao);
        listaApelidos.put("Miguel", listaMiguel);
        listaApelidos.put("Maria", listaMaria);
        listaApelidos.put("Lucas", listaLucas);



        System.out.println("**************************");

        for (String chave : listaApelidos.keySet()) {
            List loteria = listaApelidos.get(chave);
            System.out.println(chave + ": "+ loteria);


        }
    }
}