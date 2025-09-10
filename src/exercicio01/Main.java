package exercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candidato> lista = new ArrayList<>();
        lista.add(new Candidato("B", 7.9, 10));
        lista.add(new Candidato("C", 8.9, 12));
        lista.add(new Candidato("A", 8, 20));
        lista.add(new Candidato("D", 8.9, 25));

        // critério de ordenação
        Comparator<Candidato> criterio = Comparator.comparing(Candidato::getNotaTecnica)
                .thenComparing(Candidato::getAnosExperiencia).reversed()
                .thenComparing(Candidato::getNome);

        // ordenando a lista
        lista.sort(criterio);

        // impressão dos dados
        lista.forEach(candidato -> System.out.println(candidato));

    }
}
