public class Rechteck extends Figuren {

    //Attribute

    int seiteA;
    int seiteB;


    //Konstruktoren

    public Rechteck(){

    }

    public Rechteck(int seiteA,int seiteB){
        this.seiteA = seiteA;
        this.seiteB = seiteB;
    }


    //Methoden


    @Override
    public  double flaeche() {
        return seiteA * seiteB;
    }

    @Override
    public double umfang() {
        return seiteA *2 +seiteB*2;
    }

    @Override
    public void output() {
        System.out.println("Rechteck mit Länge " + this.seiteA + " und Breite " + this.seiteB + ": Fläche -> " + flaeche() + " Umfang -> " + umfang());
    }
}
