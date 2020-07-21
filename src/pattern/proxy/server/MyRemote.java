package pattern.proxy.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
	String Hello() throws RemoteException;
	
}
