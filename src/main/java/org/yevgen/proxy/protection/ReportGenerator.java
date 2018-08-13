package org.yevgen.proxy.protection;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReportGenerator extends Remote {

    String generateReport() throws RemoteException;
}
