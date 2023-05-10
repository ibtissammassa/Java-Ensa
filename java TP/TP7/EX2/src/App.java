import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
    //a:

        Client c1 = new Client("Massa", "ibtissam");
        Client c2 = new Client("Jrghaider", "Naoufal");
        Client c3 = new Client("Charf", "Omar");

        Queue<Client>file=new LinkedList<Client>();//LinkedList peut etre declarer par queue(file) ou list(liste doublement chainee)
        file.add(c1);//emfiler
        file.add(c2);
        file.add(c3);

        Client clientCourrant = null;

        // while((clientCourrant = file.poll()) != null){//defiler
        //     System.out.println("---Serving Client: "+ clientCourrant.getNom() + clientCourrant.getPrenom()+" ---");
        // }

        try {
            while((clientCourrant = file.remove()) != null){//defiler
                System.out.println("---Serving Client: "+ clientCourrant.getNom() + clientCourrant.getPrenom()+" ---");
            } 
        } catch (NoSuchElementException e) {
            System.out.println("on ne peut pas defiler une file vide");
        }


    //b:
        
    }
}
