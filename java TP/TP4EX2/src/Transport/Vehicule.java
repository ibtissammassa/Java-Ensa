package Transport;
public class Vehicule {
    private String marque;
    private int dateAchat;
    private double prixAchat;
    private double prixCourant;

    public String getMarque() {
        return marque;
    }

    public int getDateAchat() {
        return dateAchat;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixCourant(double prixCourant) {
        this.prixCourant = prixCourant;
    }

    public Vehicule(String marque, int dateAchat, double prixAchat){
        this.marque=marque;
        this.dateAchat=dateAchat;
        this.prixAchat=prixAchat;
    }
    public void affiche(){
        System.out.println("Marque: "+this.marque+" dateAchat: "
                +this.dateAchat+" prixAchat: "+this.prixAchat+" prixCourant: "+this.prixCourant);
    }
    public void calculePrix(int anneActuelle){
        this.prixCourant=this.prixAchat-this.prixAchat*(2/100)*(anneActuelle-this.dateAchat);
    }
}
