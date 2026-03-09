package CarlierBenajmin_E04;

import CarlierBenajmin_E04.aquarium.Aquarium;
import CarlierBenajmin_E04.aquarium.Piranha;
import CarlierBenajmin_E04.aquarium.Poisson;
import CarlierBenajmin_E04.aquarium.PoissonClown;

public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium(5);

        Poisson p1 = new PoissonClown("Nemo", 2, "orange");
        Poisson p2 = new Piranha("Terreur", 3, "bleu");

        aquarium.ajouterPoisson(p1);
        aquarium.ajouterPoisson(p2);

        aquarium.afficherPoissons();

        System.out.println("\nLes poissons nagent :");
        aquarium.faireNagerTous();

    }
}
