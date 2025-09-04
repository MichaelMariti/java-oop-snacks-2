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

    @Override
    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
            print("Depositato: Euro" + importo + "sul tuo Conto Risparmio");
        } else {
            print("Importo non valido");
        }
    }
    
    public void deposita(double importo, String mail) {
        if (importo > 0) {
            saldo += importo;
            print("Depositato: Euro" + importo + "sul tuo Conto Risparmio");
            print("Inviata la mail a " + mail);
        } else {
            print("Importo non valido");
        }
    }

    public int getTassoDiInteresse() {
        return tassoDiInteresse;
    }

    public void setTassoDiInteresse(int tassoDiInteresse) {
        this.tassoDiInteresse = tassoDiInteresse;
    }

    
}
