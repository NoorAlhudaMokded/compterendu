import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CompteImpl extends UnicastRemoteObject implements CompteInterface {
    private float solde;
    private float decouvert;

    public CompteImpl() throws RemoteException {
        super();
        this.solde = 0;
        this.decouvert = 0;
    }

    public float getSolde() throws RemoteException {
        return solde;
    }

    public void verser(float mt) throws RemoteException {
        solde += mt;
    }

    public void retirer(float mt) throws RemoteException {
        if (solde - mt >= -decouvert) {
            solde -= mt;
        } else {
            throw new RemoteException("Fonds insuffisants même avec découvert.");
        }
    }

    public float getDecouvert() throws RemoteException {
        return decouvert;
    }

    public void setDecouvert(float mt) throws RemoteException {
        this.decouvert = mt;
    }
}
