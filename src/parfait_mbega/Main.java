package parfait_mbega;

import parfait_mbega.aquarium.Aquarium;
import parfait_mbega.aquarium.Piranha;
import parfait_mbega.aquarium.Poisson;
import parfait_mbega.aquarium.PoissonClown;

public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium(5);

        Poisson p1 = new PoissonClown("Nemo", 2, "orange");
        Poisson p2 = new Piranha("Terreur", 3, "bleu");
        Poisson p3 = new PoissonClown("Parfait", 3, "Bleu ");

        aquarium.ajouterPoisson(p1);
        aquarium.ajouterPoisson(p2);

        aquarium.afficherPoissons();

        System.out.println("\nLes poissons nagent :");
        aquarium.faireNagerTous();
        System.out.println("=======Nouveau Poisson Clown======");
        aquarium.ajouterPoisson(p3);
        p3.manger();
        p3.seDeplacer();


    }
}
