import java.util.Set;

public class Prova {

    private Integer total = 0;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        for (Integer nota : conjuntoDeInteiros) {
            total = total + nota;
        }


    }
}
