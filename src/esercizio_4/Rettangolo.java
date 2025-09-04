package esercizio_4;

public class Rettangolo extends Figura {

    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.altezza = altezza;
        this.base = base;
    }

    // metodo final che non può essere sovrascritto perché è una costante
    public final double calcolaPerimetro() {
        return 2 * (base + altezza);
    }

    // Override del metodo in Figura
    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}
