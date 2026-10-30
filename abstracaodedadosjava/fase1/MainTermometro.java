package abstracaodedadosjava.fase1;

import java.util.Scanner;

class Termometro {
    private double celsius;

    public Termometro(double celsius) {
        this.celsius = celsius;
    }

   public double getFahrenheit() {
       return (celsius * 9 / 5 + 32);
   }

   public double getKelvin() {
        return (celsius + 273.15);
   }

    public boolean setCelsius(double novo) {
        if (novo < -273.15) {
            return false;
        }
        this.celsius = novo;
        return true;
    }

   public double getCelsius() {
        return celsius;
   }

}


public class MainTermometro {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Digite uma temperatura em Celsius: ");
       double celsius = sc.nextDouble();
       Termometro termometro = new Termometro(celsius);

       System.out.println(termometro.getFahrenheit());     // 77.0
       System.out.println(termometro.getKelvin());         // 298.15
       System.out.println(termometro.setCelsius(-300));    // false
       System.out.println(termometro.getCelsius());        // 25.0
    }
}
