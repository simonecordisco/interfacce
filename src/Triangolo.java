public class Triangolo implements Forma{
    double larghezza;
    double altezza;
    Triangolo(double altezza,double larghezza){
        this.altezza= altezza;
        this.larghezza=larghezza;
    }
    @Override
    public double CalcolaArea(){
        double area = (larghezza*altezza)/2;
        return area;
    }
}
