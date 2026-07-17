package br.com.edl20262.aplicacoes;

import java.util.ArrayList;
import java.util.List;

public class ListaDemoApplication {

    public static void main(String[] args) {
        List<String> disciplinas = new ArrayList<>();
        disciplinas.add("Estrutura de Dados Lineares");
        disciplinas.add("Programação Orientada a Objetos");
        disciplinas.add(1, "Algoritmos");

        System.out.println("=== Demonstração de Lista ===");
        System.out.println("Conteúdo da lista: " + disciplinas);
        System.out.println("Primeiro elemento: " + disciplinas.get(0));
        System.out.println("Quantidade de elementos: " + disciplinas.size());
    }
}
