package abstracaodedadosjava.fase2;


class Pilha {
    private int[] dados;
    private int topo;

    public Pilha(int capacidade) {
        dados = new int[capacidade];
        topo = -1;
    }

    public boolean empilhar(int x) {
        if (estaCheia()) {
            return false;
        }
        topo++;
        dados[topo] = x;
        return true;
    }

    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("Aviso: pilha vazia");
            return -1;
        }
        int valor = dados[topo];
        topo--;
        return valor;
    }

    public int espiar() {
        if (estaVazia()) {
            System.out.println("Aviso: pilha vazia");
            return -1;
        }
        return dados[topo];
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == dados.length - 1;
    }

    public int tamanho() {
        return topo + 1;
    }
}

public class MainPilha {
    public static void main(String[] args) {
        Pilha p = new Pilha(3);
        p.empilhar(10);
        p.empilhar(20);
        p.empilhar(30);
        System.out.println(p.empilhar(40));   // false
        System.out.println(p.desempilhar());  // 30
        System.out.println(p.espiar());       // 20
        System.out.println(p.tamanho());      // 2
    }
}