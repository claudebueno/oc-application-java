    package applicationjavaoc;

    /**
     * Created by claude on 05/09/2016.
     */
    public class JavaApplicationOC {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            Ville v = new Ville();
            Ville v1 = new Ville("Marseille", 1236, "France");
            Ville v2 = new Ville("Rio", 321654, "Brésil");

            System.out.println("\n\n"+v1.decrisToi());
            System.out.println(v.decrisToi());
            System.out.println(v2.decrisToi()+"\n\n");
            System.out.println(v1.comparer(v2));

            /**
             * Si vous ne lui mettez aucun paramètre, super() renverra le constructeur par défaut de la classe Ville.
             */
            System.out.println("------------------------------------------");
            System.out.println("Sans paramètre super renvoie le constructeur");
            System.out.println("------------------------------------------ \n");
            Capitale cap = new Capitale("Paris", 654987, "France", "Notre Dame");
            System.out.println(cap.decrisToi());
        }

    }
