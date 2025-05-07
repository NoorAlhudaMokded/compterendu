import java.rmi.Naming;

public class ClientCalc {
    public static void main(String[] args) {
        try {
            Calculatrice calc = (Calculatrice) Naming.lookup("rmi://localhost/CalculatriceService");

            double a = 12.0, b = 4.0;
            System.out.println("Addition : " + calc.addition(a, b));
            System.out.println("Soustraction : " + calc.soustraction(a, b));
            System.out.println("Multiplication : " + calc.multiplication(a, b));
            System.out.println("Division : " + calc.division(a, b));
        } catch (Exception e) {
            System.err.println("Erreur client : " + e);
        }
    }
}
