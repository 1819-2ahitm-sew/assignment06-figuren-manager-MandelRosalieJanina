public class Main {

    public static void main(String[] args) {

        Quadrat quadrat = new Quadrat(4);
        Dreieck dreieck = new Dreieck(5,5,90);
        Rechteck rechteck = new Rechteck(6,4);
        Kreis kreis = new Kreis(5);
        Ellipse ellipse = new Ellipse(16,9);


        Figuren[] figuren = {quadrat,dreieck,ellipse,kreis,rechteck};


        for (int i = 0; i < figuren.length ; i++) {
            figuren[i].output();
        }



    }

}
