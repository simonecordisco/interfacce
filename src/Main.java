//Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo dell'area.
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(5,5);
        Triangolo triangolo1 = new Triangolo(4,5);
        System.out.println(rettangolo1.CalcolaArea());
        System.out.println(triangolo1.CalcolaArea());
    }
}