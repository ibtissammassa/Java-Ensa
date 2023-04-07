import java.util.Arrays;

public class App {
    
    public class Abonne{
        private String nom;
        private String num;
    
        public Abonne(String nom,String num){
            this.nom=nom;
            this.num=num;
        }
    }
    
    public class Repertoire{
        private Abonne[] repertoire;
        private int numAbonne;
    
        public Repertoire(int maxAbonne){
            this.repertoire=new Abonne[maxAbonne];
            this.numAbonne=0;
        }
    
        public boolean addAbonne(Abonne abonne){
            if(numAbonne<repertoire.length){
                repertoire[numAbonne]=abonne;
                numAbonne++;
                return true;
            }else{
                return false;
            }
        }
    
        public String getNumero (String nom){
            for(int i=0;i<numAbonne;i++){
                if(repertoire[i].nom==nom){
                    return repertoire[i].num;
                }
            }return null;
        }
    
        public int getNAbonnes(){
            return numAbonne;
        }
    
        public Abonne getAbonne(int rang){
            if(rang>0 && rang<numAbonne){
                return repertoire[rang];
            }else{
                return null;
            }
        }
    
        public Abonne[] getAbonnesTries(){
            Abonne[] RepTrie=Arrays.copyOf(repertoire, numAbonne);
            Arrays.sort(RepTrie, (A1,A2)->{
                return A1.nom.compareTo(A2.nom);});
            return RepTrie;
        }
    }
    public static void main(String[] args){
        App test = new App();
        Repertoire repertoire = test.new Repertoire(5);

        Abonne A1=test.new Abonne("Ibtissam","1111111111");
        Abonne A2=test.new Abonne("Omar","2222222222");
        Abonne A3=test.new Abonne("Amal","33333333333");

        repertoire.addAbonne(A1);
        repertoire.addAbonne(A2);
        repertoire.addAbonne(A3);

        System.out.println("Ibtissam's number is: "+repertoire.getNumero("Ibtissam"));//11111111111

        System.out.println("Numero d'abonnes: "+repertoire.getNAbonnes());//3

        System.out.println("Le 2eme abonne est: "+repertoire.getAbonne(1).nom);//Omar

        System.out.println("Repertoire trié: "+Arrays.toString(repertoire.getAbonnesTries()));

    }
}
