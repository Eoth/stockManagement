package theooliv.fr;
import java.util.List;
public class listeproduits {
    List<produit> listesproduits;
    public listeproduits() {
        produit a = new produit(1,"Olymique de Marseille", 10);
        this.listesproduits.add(a);
         a = new produit(2,"stacke 2", 4);
        this.listesproduits.add(a);
    }

    public List<produit> getListesproduits() {
        return listesproduits;
    }

    public void ajouter(int i){
        this.listesproduits.get(i).setNb(listesproduits.get(i).getNb()+1);
    }
    public void retirer(int i){
        this.listesproduits.get(i).setNb(listesproduits.get(i).getNb()-1);
    }
}
