// Es 3)
// Consegna:
// - Crea una classe Utente con attributo nome.
// - Aggiungi un attributo statico numeroUtenti che tiene il conto delle istanze create.
// - In ogni costruttore, incrementa numeroUtenti.
// - Crea un metodo statico getNumeroUtenti() che restituisce il totale.
// Nel main, crea 3 utenti e stampa il numero totale usando il metodo statico.


package esercizio_3;

public class Utente {
    private String nome;
    private static int numeroUtenti = 0;

    public Utente(String nome) {
        numeroUtenti++;
    }

    public static int getNumeroUtenti() {
        return numeroUtenti;
    }

    public String getNome() {
        return nome;
    }
}
