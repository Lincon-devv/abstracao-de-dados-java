package abstracaodedadosjava.fase2;

import java.util.ArrayList;

class Item {
    private String nome;
    private double peso;

    public Item(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }
}

class Inventario {
    private ArrayList<Item> itens = new ArrayList<>();

    // Não existe getItens() de propósito: se devolvesse a lista interna,
    // quem recebesse a referência poderia fazer lista.add(...) direto,
    // passando por cima dos limites de 5 itens e 20,0 kg e quebrando a
    // invariante. Toda alteração precisa passar por adicionar() e remover().

    public boolean adicionar(Item i) {
        if (itens.size() >= 5) {
            return false;
        }
        if (pesoTotal() + i.getPeso() > 20.0) {
            return false;
        }
        itens.add(i);
        return true;
    }

    public boolean remover(String nome) {
        for (int k = 0; k < itens.size(); k++) {
            if (itens.get(k).getNome().equals(nome)) {
                itens.remove(k);
                return true;
            }
        }
        return false;
    }

    public double pesoTotal() {
        double total = 0;
        for (Item i : itens) {
            total += i.getPeso();
        }
        return total;
    }

    public void listar() {
        for (Item i : itens) {
            System.out.println(i.getNome() + ": " + i.getPeso() + " kg");
        }
    }
}

public class MainInventario {
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        inv.adicionar(new Item("Espada", 8));
        inv.adicionar(new Item("Escudo", 7));
        inv.adicionar(new Item("Poção", 1));
        System.out.println(inv.adicionar(new Item("Armadura", 10)));  // false
        System.out.println(inv.pesoTotal());                           // 16.0
        inv.listar();
    }
}
