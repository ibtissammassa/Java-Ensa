package Transport;
import java.lang.Math;

public class Voiture extends Vehicule {
    protected double cylindree;
    protected double nbPortes;
    protected double puissance;
    protected double kilometrage;

    public Voiture(String marque,int dateAchat,double prixAchat,
                   double cylindree,int nbPortes,double puissance,double kilometrage){
        super(marque, dateAchat, prixAchat);
        this.cylindree=cylindree;
        this.nbPortes=nbPortes;
        this.puissance=puissance;
        this.kilometrage=kilometrage;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Cylindree: "+this.cylindree+" nbPortes: "+this.nbPortes
                +" puissance: "+this.puissance+" kilometrage "+this.kilometrage);
    }

    @Override
    public void calculePrix(int anneActuelle) {
        int i;
        double prix = this.getPrixAchat();
        int annes = anneActuelle - this.getDateAchat();
        double tranche = Math.round(this.kilometrage/10000);

        for(i=0;i<annes;i++){
            prix -= prix * (2/100);
        }

        for(i=0;i<tranche;i++){
            prix -= prix * 6/100;
        }

        if(this.getMarque()=="Renault" || this.getMarque()=="Fiat"){
            prix -= prix * 5/100;
        } else if (this.getMarque()=="Ferrari" || this.getMarque()=="Porche") {
            prix += prix * 10/100;
        }

        if(prix<0){
            prix=0;
        }
        this.setPrixCourant(prix);

    }
}
