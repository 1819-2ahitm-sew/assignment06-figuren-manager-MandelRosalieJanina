public class Kreis extends Figuren {

    //Attribute

   int radius;


    //Konstruktoren

    public Kreis(){

    }

    public Kreis(int radius){
  this.radius = radius;
    }


    //Methoden


    @Override
    public  double flaeche() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double umfang() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void output() {
        System.out.println("Kreis mit Radius " + this.radius + ": Fläche -> " + flaeche() + " Umfang -> " + umfang());
    }
}

