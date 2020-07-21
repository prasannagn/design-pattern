package pattern.proxy.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import pattern.proxy.server.MyRemote;

public class MyRemoteClient {
	public static void main(String[] args) throws MalformedURLException,
			RemoteException, NotBoundException {
		MyRemote service = (MyRemote) Naming
				.lookup("rmi://dev.orange.co.uk/RemoteHello");
		System.out.println(service.Hello());
	}
}
