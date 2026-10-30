package abstracaodedadosjava.fase1;

// Main.java
class Placar {
    private String nomeCasa;
    private String nomeVisitante;
    private int golsCasa;
    private int golsVisitante;

    public Placar(String nomeCasa, String nomeVisitante) {
        this.nomeCasa = nomeCasa;
        this.nomeVisitante = nomeVisitante;
    }

    public void golCasa() {
        golsCasa++;
    }

    public void golVisitante() {
        golsVisitante++;
    }

    public void anularGolCasa() {

        if (golsCasa > 0) {
            golsCasa--;
        }
    }

    public void anularGolVisitante() {
        if (golsVisitante > 0) {
            golsVisitante--;
        }
    }

    public String resultado() {
        return nomeCasa + " " + golsCasa + " x " + golsVisitante + " " + nomeVisitante;
    }

    public String vencedor() {
        if (golsCasa > golsVisitante) {
            return nomeCasa;
        }
        if (golsVisitante > golsCasa) {
            return nomeVisitante;
        }
        return "Empate";
    }
}

public class MainPlacar {
    public static void main(String[] args) {

        Placar p = new Placar("Tigres", "Leões");
        p.golCasa();
        p.golCasa();
        p.golVisitante();
        p.anularGolVisitante();
        p.anularGolVisitante();
        System.out.println(p.resultado());
        System.out.println(p.vencedor());


        Placar q = new Placar("Tigres", "Leões");
        q.anularGolCasa();
        q.anularGolVisitante();
        System.out.println(q.resultado());
        System.out.println(q.vencedor());

        q.golVisitante();
        System.out.println(q.vencedor());
    }
}
