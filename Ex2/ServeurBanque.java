import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServeurBanque {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            CompteInterface compte = new CompteImpl();
            Naming.rebind("rmi://localhost/CompteService", compte);
            System.out.println("Serveur prêt.");
        } catch (Exception e) {
            System.err.println("Erreur serveur : " + e);
        }
    }
}
