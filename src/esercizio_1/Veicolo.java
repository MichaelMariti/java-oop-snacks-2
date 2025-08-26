// Es 1)
// Consegna:
// - Crea una classe Veicolo con i campi privati marca e anno.
// - Crea una sottoclasse Auto con un campo aggiuntivo numeroPorte.
// - Usa costruttori per inizializzare gli attributi.
// - Fornisci metodi get e set per tutti i campi.
// Scrivi un metodo stampaInfo() in Veicolo, e sovrascrivilo in Auto.


package esercizio_1;

public class Veicolo {

    private String marca;

    private int anno;

    
    public Veicolo(String marca, int anno) {
        this.marca = marca;
        this.anno = anno;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public int getAnno() {
        return anno;
    }


    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void stampaInfo() {
        System.out.println("Veicolo: " + marca + ", Anno: " + anno);
    }
}
