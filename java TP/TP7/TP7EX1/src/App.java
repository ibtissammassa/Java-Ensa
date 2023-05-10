import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> villes = new ArrayList<String>();
        villes.add("Tanger");
        villes.add("Fes");
        villes.add("Casablanca");
        villes.add("Rabat");
        villes.add("Agadir");
//a+b
        // Collections.sort(villes, Comparator.naturalOrder());
        // Collections.sort(villes, Comparator.reverseOrder());

        // for(String E:villes){
        //     System.out.println(E);
        // }
//c
        // for(int i=villes.size();i>0;i--){
        //     System.out.println(villes.get(i-1));
        // }

        // Collections.reverse(villes);
//d
        // villes.sort(Comparator.comparingInt(String::length));
        // for(String E:villes){
        //     System.out.println(E);
        // }
//e
        // villes.sort(Comparator.comparingInt(String::length));
        // Collections.reverse(villes);
        
        //on donne a sort seulement les objetx et caet elle qui se charge de chercher les methodes de comparisons de 
        //l'objet sort qui intervien pour faire l'operation
        villes.sort(new StringSetLengthDec());
        
        for(String E:villes){
            System.out.println(E);
        }
        
    }
}
