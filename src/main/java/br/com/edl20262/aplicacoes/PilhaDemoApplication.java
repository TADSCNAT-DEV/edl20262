package br.com.edl20262.aplicacoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaDemoApplication {

    public static void main(String[] args) {
        Deque<Integer> pilha = new ArrayDeque<>();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("=== Demonstração de Pilha ===");
        System.out.println("Topo atual: " + pilha.peek());
        System.out.println("Removendo topo: " + pilha.pop());
        System.out.println("Novo topo: " + pilha.peek());
    }
}
