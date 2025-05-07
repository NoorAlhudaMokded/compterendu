import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ServeurCalc extends UnicastRemoteObject implements Calculatrice {

    public ServeurCalc() throws RemoteException {
        super();
    }

    public double addition(double a, double b) throws RemoteException {
        return a + b;
    }

    public double soustraction(double a, double b) throws RemoteException {
        return a - b;
    }

    public double multiplication(double a, double b) throws RemoteException {
        return a * b;
    }

    public double division(double a, double b) throws RemoteException {
        if (b == 0) {
            throw new RemoteException("Division par zéro");
        }
        return a / b;
    }
}
