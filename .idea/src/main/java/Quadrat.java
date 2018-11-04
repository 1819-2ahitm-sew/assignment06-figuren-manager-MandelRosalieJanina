public class Quadrat extends Figuren {

    //Attribute

     int seite;


    //Konstruktoren

    public Quadrat(){

    }

    public Quadrat(int seite){
        this.seite = seite;
    }


    //Methoden


    @Override
    public  double flaeche() {
       return seite * seite;
    }

    @Override
    public double umfang() {
       return seite *4;
    }

    @Override
    public void output() {
        System.out.println("Quadrat mit Seitenlänge "+seite+": Fläche ->"+flaeche()+",Umfang ->"+umfang());
    }
}
