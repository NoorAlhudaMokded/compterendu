import java.rmi.Naming;

public class ClientBanque {
    public static void main(String[] args) {
        try {
            CompteInterface compte = (CompteInterface) Naming.lookup("rmi://localhost/CompteService");

            System.out.println("Solde initial: " + compte.getSolde());
            compte.verser(500);
            System.out.println("Après versement de 500: " + compte.getSolde());
            compte.setDecouvert(200);
            compte.retirer(600);
            System.out.println("Après retrait de 600: " + compte.getSolde());
            System.out.println("Découvert autorisé: " + compte.getDecouvert());
        } catch (Exception e) {
            System.err.println("Erreur client : " + e);
        }
    }
}
