package etudiant19.aquarium;

public abstract class AbstractAnimal {

    protected String nom;
    protected int age;
    //Autre commentaire aussi bidon
    public AbstractAnimal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public abstract void seDeplacer();
}
