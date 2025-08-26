// Es 2)
// Consegna:
// - Crea una classe ContoBancario con i campi privati saldo e numeroConto.
// - Crea metodi pubblici deposita(), preleva(), getSaldo().
// - Crea una sottoclasse ContoRisparmio che aggiunge un tasso di interesse.
// Aggiungi un metodo applicaInteressi() che aumenta il saldo.
// Testa tutto nel main e spiega perché serve l’incapsulamento.


package esercizio_2;

public class ContoBancario {

    private double saldo;

    private String numeroConto;

    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }


    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Depositato: Euro" + importo);
        } else {
            System.out.println("Importo non valido");
                    }
    }

    public void preleva(int importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelevato: Euro" + importo);            
        } else {
            System.out.println("Importo non disponibile");
            
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConto() {
        return numeroConto;
    }

    
}
