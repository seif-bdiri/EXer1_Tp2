public class livree {
    private int id;
    private String auteur;
    private String titre;
    private float prix;

    public livree(int id, String auteur, String titre, float prix) {
        this.id = id;
        this.auteur = auteur;
        this.titre = titre;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void tooString() {
        System.out.println(id + "/" + auteur + "/" + titre + "/" + prix);
    }
}
