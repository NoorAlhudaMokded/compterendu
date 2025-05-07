import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class LancerServeur {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); // Lancer le registre RMI
            ServeurCalc obj = new ServeurCalc();
            Naming.rebind("rmi://localhost/CalculatriceService", obj);
            System.out.println("Serveur de calculatrice prêt.");
        } catch (Exception e) {
            System.err.println("Erreur serveur : " + e);
        }
    }
}
