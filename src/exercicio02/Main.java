package exercicio02;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // lista dos alunos matriculados em banco de dados
        Set<Aluno> turmaBD = new HashSet<>();
        turmaBD.add(new Aluno(10, "A", "A"));
        turmaBD.add(new Aluno(20, "B", "B"));
        turmaBD.add(new Aluno(10, "C", "C"));
        turmaBD.add(new Aluno(30, "D", "D"));

        // lista de alunos matriculados em estrutura de dados
        Set<Aluno> turmaED = new HashSet<>();
        turmaED.add(new Aluno(50, "F", "F"));
        turmaED.add(new Aluno(20, "B", "B"));
        turmaED.add(new Aluno(30, "D", "D"));

        // lista de todos os alunos matriculados
        System.out.println("Alunos matriculados nas duas disciplinas");
        Set<Aluno> uniao = new HashSet<>(turmaBD);
        uniao.addAll(turmaED);
        uniao.forEach(aluno -> System.out.println(aluno));

        // lista dos alunos matriculados nas duas disciplinas
        System.out.println("\nAlunos matriculados nas duas disciplinass");
        Set<Aluno> nasDuas = new HashSet<>(turmaBD);
        nasDuas.retainAll(turmaED);
        nasDuas.forEach(aluno -> System.out.println(aluno));

        // lista dos alunos matriculados só em Banco de Dados
        System.out.println("\nAlunos matriculados só em Banco de Dados");
        Set<Aluno> soBD = new HashSet<>(turmaBD);
        soBD.removeAll(turmaED);
        soBD.forEach(aluno -> System.out.println(aluno));

        // lista dos alunos matriculados só em Estrutura de Dados
        System.out.println("\nAlunos matriculados só em Estrutura de Dados");
        Set<Aluno> soED = new HashSet<>(turmaED);
        soED.removeAll(turmaBD);
        soED.forEach(aluno -> System.out.println(aluno));
    }
}
