package esercizio_2;

public class ContoRisparmio extends ContoBancario {
    private int tassoDiInteresse;

    public ContoRisparmio(String numeroConto, int tassoDiInteresse) {
        super(numeroConto);
        this.tassoDiInteresse = tassoDiInteresse;
    }

    public void applicaInteressi() {
        double saldoAttuale = getSaldo();
        double interessi = saldoAttuale * tassoDiInteresse / 100;
        deposita(interessi);
    }

    public int getTassoDiInteresse() {
        return tassoDiInteresse;
    }

    public void setTassoDiInteresse(int tassoDiInteresse) {
        this.tassoDiInteresse = tassoDiInteresse;
    }

    
}
