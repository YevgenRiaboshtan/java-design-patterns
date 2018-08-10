package org.yevgen.proxy.remote;

import java.rmi.Naming;

public class ReportGeneratorClient {
    /*
        Run instruction:
        1. Run Compile.bat
        2. Run ServerStart.bat
        3. Run ReportGeneratorClient.main method
     */
    public static void main(String[] args) {
        new ReportGeneratorClient().generateReport();
    }

    public void generateReport() {
        try {
            ReportGenerator reportGenerator = (ReportGenerator) Naming.lookup("rmi://127.0.0.1/RemoteReportGenerator");
            System.out.println(reportGenerator.generateReport());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
