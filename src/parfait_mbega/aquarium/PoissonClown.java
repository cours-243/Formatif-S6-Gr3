package parfait_mbega.aquarium;

public class PoissonClown extends Poisson {

    public PoissonClown(String nom, int age, String couleur) {
        super(nom, age, couleur);
    }

    @Override
    public void manger() {

        System.out.println(nom + " mange des frites au ketchup");
        System.out.println( "Sa couleur "+couleur+ "m'attire plus que tout!");
    }

}
