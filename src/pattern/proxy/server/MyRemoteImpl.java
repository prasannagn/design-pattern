package pattern.proxy.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	private static final long serialVersionUID = 8952886565245944186L;

	protected MyRemoteImpl() throws RemoteException {

	}

	@Override
	public String Hello() {
		return "Server Says Hello";
	}

	public static void main(String[] args) throws RemoteException,
			MalformedURLException {
		MyRemote service = new MyRemoteImpl();
		Naming.rebind("RemoteHello", service);
	}

}
