package abstracaodedadosjava.fase1;

class Lampada {
    private boolean ligada;
    private int vezesLigada;

    public void ligar() {
        if (!ligada) {
            ligada = true;
            vezesLigada++;
        }
    }

    public void desligar() {
        ligada = false;
    }

    public void alternar() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }

    public boolean estaLigada() {
        return ligada;
    }

    public int getVezesLigada() {
        return vezesLigada;
    }
}

public class MainLampada {
    public static void main(String[] args) {

        Lampada l = new Lampada();
        l.ligar();
        l.ligar();
        l.alternar();
        l.alternar();
        System.out.println(l.estaLigada());
        System.out.println(l.getVezesLigada());

        Lampada l2 = new Lampada();
        l2.desligar();
        l2.desligar();
        System.out.println(l2.getVezesLigada());
        l2.ligar();
        l2.ligar();
        l2.ligar();
        System.out.println(l2.getVezesLigada());
        l2.alternar();
        l2.alternar();
        System.out.println(l2.getVezesLigada());
    }
}