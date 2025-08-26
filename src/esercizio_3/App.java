package esercizio_3;

public class App {
    public static void main(String[] args) {
        

        Utente u1 = new Utente("Mario");
        Utente u2 = new Utente("Luigi");
        Utente u3 = new Utente("Mirela");

        System.out.println("Totale dei numeri utenti: " + Utente.getNumeroUtenti());
    }
}
