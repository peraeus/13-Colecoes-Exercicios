package exercicio03;

import java.util.*;

public class exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> contador = new HashMap<>();
        String frase;

        System.out.print("Frase --> ");
        frase = sc.nextLine();

        for (char c : frase.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                contador.put(c, contador.getOrDefault(c, 0) + 1);
            }
        }
            // constrói uma árvore rubro-negra com as chaves
            Set<Character> chave = contador.keySet();
            TreeSet<Character> tree = new TreeSet<>(chave);
            tree.forEach(c -> {
                System.out.println(c + " --> " + contador.get(c));
            });
        }
    }

