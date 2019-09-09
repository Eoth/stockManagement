package theooliv.fr;

public class produit {
    public int id;
    public String nom;
    public int nb;

    public produit(int id, String nom, int nb) {
        this.id = id;
        this.nom = nom;
        this.nb = nb;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }
}
