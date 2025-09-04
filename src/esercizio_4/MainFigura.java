
package esercizio_4;

public class MainFigura {
    public static void main(String[] args) {
        
        Cerchio c = new Cerchio(5);
        System.out.println("L'area del cerchio è: " + c.calcolaArea());

        Rettangolo r = new Rettangolo(4, 6);
        System.out.println("L'area del rettangolo è: " + r.calcolaArea());


        // Perimetro
        System.out.println("Il perimetro del rettangolo è: " + r.calcolaPerimetro());


    }
}
