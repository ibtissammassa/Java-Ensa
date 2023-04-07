package Transport;
public class Avion extends Vehicule{
    protected String moteur;
    protected int heuresVol;

    public Avion(String marque,int dateAchat,double prixAchat,String moteur,int heuresVol){
        super(marque, dateAchat, prixAchat);
        this.moteur=moteur;
        this.heuresVol=heuresVol;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("moteur: "+this.moteur+" heuresVol:"+this.heuresVol);
    }

    @Override
    public void calculePrix(int anneActuelle) {
        double prix = this.getPrixAchat();
        double tranches;

        if(this.moteur=="hélices"){
            tranches=this.heuresVol/150;
            for (int i=0;i<tranches;i++){
                prix -= prix * 5/100;
            }
        }else{
            tranches=this.heuresVol/1100;
            for (int i=0;i<tranches;i++){
                prix -= prix * 10/100;
            }
        }

        if(prix<0){
            prix=0;
        }

        this.setPrixCourant(prix);
    }
}
