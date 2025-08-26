package esercizio_1;
public class App {
    public static void main(String[] args) throws Exception {
        

        Veicolo v = new Veicolo("Ford", 1990);

        v.stampaInfo();

        Auto a = new Auto("Fiat", 1999, 5);

        a.stampaInfo();
    }
}
