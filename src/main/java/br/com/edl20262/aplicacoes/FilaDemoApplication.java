package br.com.edl20262.aplicacoes;

import java.util.ArrayDeque;
import java.util.Queue;

public class FilaDemoApplication {

    public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>();
        fila.add("Aluno A");
        fila.add("Aluno B");
        fila.add("Aluno C");

        System.out.println("=== Demonstração de Fila ===");
        System.out.println("Primeiro da fila: " + fila.peek());
        System.out.println("Removendo primeiro: " + fila.poll());
        System.out.println("Próximo da fila: " + fila.peek());
    }
}
