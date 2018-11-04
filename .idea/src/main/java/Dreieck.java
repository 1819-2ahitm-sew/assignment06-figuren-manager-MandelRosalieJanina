public class Dreieck extends Figuren {
    //Attribute

    int seite1;
    int seite2;
    double winkel;


    //Konstruktoren

    public Dreieck(){

    }

    public Dreieck(int seite1,int seite2,int winkel){
        this.seite1 = seite1;
        this.seite2 = seite2;
        this.winkel = winkel * Math.PI / 180;
    }


    //Methoden


    @Override
    public  double flaeche() {
        return seite1 * seite2 * Math.sin(winkel) / 2;
    }

    @Override
    public double umfang() {
        double seite3 = Math.sqrt(seite1 * seite1 + seite2 * seite2 - 2 * seite1 * seite2 * Math.cos(winkel));
        return seite3 + seite2 + seite1;
    }

    @Override
    public void output() {
        System.out.println("Dreieck mit a: " + seite1 + " und b: " + seite2 +
                " und \u03B1: " + winkel + ": Fläche -> " + flaeche() + " Umfang -> " + umfang());
    }
}
