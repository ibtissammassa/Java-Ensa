public class App {
    
    // methode récursive pour calculer la puissance
    public static double puissance(double x, int k) {
        if (k == 0) {
            return 1;
        } else if (k > 0) {
            return x * puissance(x, k - 1);
        } else {
            return 1 / (x * puissance(x, k + 1));
        }
    }
    
    // methode récursive pour calculer la multiplication
    public static boolean multiple(int n, int p) {
        if (n == 0 || p == 0) { // Si l'un des nombres est égal à zéro, alors il n'y a pas de multiple
            return false;
        } else if (n < p) { // Si n est plus petit que p, alors il ne peut pas être un multiple de p
            return false;
        } else if (n == p) { // Si n est égal à p, alors n est un multiple de p
            return true;
        } else { // Sinon, on appelle récursivement la fonction en soustrayant p de n jusqu'à ce que n soit égal ou plus petit que p
            return multiple(n - p, p);
        }
    }    
    
    public static void main(String[] args) {
        double x = 2;
        int k = 3;
        System.out.println(x + " a la puissance " + k + " est " + puissance(x, k));
        
        int n = 15;
        int p = 3;
        System.out.println(n + " est " + (multiple(n, p) ? "un" : "non pas un") + " multiple de " + p);
    }
}
