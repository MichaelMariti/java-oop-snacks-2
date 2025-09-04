package esercizio_4;

public class OverrideMetodoRettangolo extends Rettangolo {

    public OverrideMetodoRettangolo () {
        super(base, altezza);

    }

    // Tentativo di override del metodo calcolaPerimetro in Rettangolo - dovrebbe dare errore perché il metodo è Final
    @Override
    public final double calcolaPerimetro() {
        return 0;
    }
}
