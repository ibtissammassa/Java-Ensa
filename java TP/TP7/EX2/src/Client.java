public class Client {
    private String nom;
    private String prenom;
    private int pointFidelite;

    public Client(String nom, String prenom, int pointFidelite) {
        this.nom = nom;
        this.prenom = prenom;
        this.pointFidelite = pointFidelite;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getPointFidelite() {
        return pointFidelite;
    }
}
