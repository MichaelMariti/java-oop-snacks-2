package esercizio_2;

public class App {
    public static void main(String[] args) {
        
        ContoBancario conto1 = new ContoBancario("IT068543KKFKL29009");

        conto1.deposita(1000);

        System.out.println("Saldo conto1: Euro" + conto1.getSaldo());

        ContoRisparmio contoRisparmio1 = new ContoRisparmio("DU12345", 20);

        contoRisparmio1.deposita(2000);
        System.out.println("Saldo conto risparmio: Euro" + contoRisparmio1.getSaldo());
        contoRisparmio1.applicaInteressi();
        System.out.println("Saldo conto risparmio aggiornato: Euro" + contoRisparmio1.getSaldo());

        // Preleviamo
        contoRisparmio1.preleva(500);
        System.out.println("Saldo dopo il prelievo: Euro" + contoRisparmio1.getSaldo());

        // COn l'incapsulamento proteggiamo gli attributi dall'accesso diretto. Con i metodi creati eseguiamo le operazioni in sicurezza senza manomettere i dati direttamente con la possibilità di causare errori (es. saldo negativo). Questo è l'incapsulamento e con esso questa operazione di manomissione degli attributi diventa impossibile.
    }
}
