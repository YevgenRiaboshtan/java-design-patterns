package org.yevgen.proxy.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class ReportGeneratorImpl extends UnicastRemoteObject implements ReportGenerator {

    public ReportGeneratorImpl() throws RemoteException {
        super();
    }

    @Override
    public String generateReport() {
        return "**Report**"
                + "\n date:" + new Date()
                + "\n sell items 10 "
                + "\n buy items 10 "
                + "\n total items 20 ";
    }

    public static void main(String[] args) {
        try {
            ReportGenerator reportGenerator = new ReportGeneratorImpl();
            Naming.rebind("RemoteReportGenerator", reportGenerator);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
