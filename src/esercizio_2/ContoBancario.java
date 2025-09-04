// Es 2)
// Consegna:
// - Crea una classe ContoBancario con i campi privati saldo e numeroConto.
// - Crea metodi pubblici deposita(), preleva(), getSaldo().
// - Crea una sottoclasse ContoRisparmio che aggiunge un tasso di interesse.
// Aggiungi un metodo applicaInteressi() che aumenta il saldo.
// Testa tutto nel main e spiega perché serve l’incapsulamento.


package esercizio_2;

public class ContoBancario {

    protected double saldo;

    private final String numeroConto;

    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }


    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
            print("Depositato: Euro" + importo + "sul tuo Conto Bancario");
        } else {
            print("Importo non valido");
        }
    }

    public void preleva(int importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            print("Prelevato: Euro" + importo);            
        } else {
            print("Importo non disponibile");
            
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConto() {
        return numeroConto;
    }

    protected void print(String msg){
        System.out.println(msg);
    }

    
}
