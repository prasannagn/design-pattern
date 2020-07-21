package pattern.proxy.server;

import java.lang.reflect.Method;
import java.rmi.*;
import java.rmi.server.*;

// Referenced classes of package pattern.proxy.server:
//            MyRemote

public final class MyRemoteImpl_Stub extends RemoteStub
    implements MyRemote, Remote
{

    private static final long serialVersionUID = 2L;
    private static Method $method_Hello_0;

    public MyRemoteImpl_Stub(RemoteRef remoteref)
    {
        super(remoteref);
    }

    public String Hello()
        throws RemoteException
    {
        try
        {
            Object obj = super.ref.invoke(this, $method_Hello_0, null, 0x2e7dbf67759943e6L);
            return (String)obj;
        }
        catch(RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        catch(RemoteException remoteexception)
        {
            throw remoteexception;
        }
        catch(Exception exception)
        {
            throw new UnexpectedException("undeclared checked exception", exception);
        }
    }

    static Class _mthclass$(String s)
    {
        try
        {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    static 
    {
        try
        {
            $method_Hello_0 = (pattern.proxy.server.MyRemote.class).getMethod("Hello", new Class[0]);
        }
        catch(NoSuchMethodException _ex)
        {
            throw new NoSuchMethodError("stub class initialization failed");
        }
    }
}
