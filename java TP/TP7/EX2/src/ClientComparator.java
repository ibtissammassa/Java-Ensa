import java.util.Comparator;

public class ClientComparator implements Comparator<Client>{
    @Override
    public int compare(Client arg0, Client arg1) {
        return -(arg0.getPointFidelite() - arg1.getPointFidelite());
    }
}
