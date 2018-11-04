public class Ellipse extends Figuren {
    //Attribute

    int hauptAchse;
    int nebenAchse;


    //Konstruktoren

    public Ellipse(){

    }

    public Ellipse(int hauptAchse,int nebenAchse){
        this.hauptAchse = hauptAchse;
        this.nebenAchse = nebenAchse;
    }


    //Methoden


    @Override
    public  double flaeche() {
        return Math.PI * hauptAchse *nebenAchse;
    }

    @Override
    public double umfang() {
        return Math.PI * (hauptAchse + nebenAchse) * ( 1 + 3 *((hauptAchse - nebenAchse) / (hauptAchse + nebenAchse) 
                * (hauptAchse - nebenAchse) / (hauptAchse + nebenAchse)) / (10 + Math.sqrt(4 - 3 * ((hauptAchse - nebenAchse) 
                / (hauptAchse + nebenAchse) * (hauptAchse - nebenAchse) / (hauptAchse + nebenAchse)))));
    }

    @Override
    public void output() {
        System.out.println("Ellipse mit Hauptachse " + this.hauptAchse + " und Nebenachse " + this.nebenAchse + ": Fläche -> " + flaeche() + " Umfang -> " + umfang());
    }
}



