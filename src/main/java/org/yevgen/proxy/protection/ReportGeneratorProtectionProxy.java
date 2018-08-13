package org.yevgen.proxy.protection;

import org.yevgen.proxy.remote.ReportGenerator;

import java.rmi.Naming;

public class ReportGeneratorProtectionProxy implements ReportGeneratorProxy {

    private Empoyee empoyee;

    public void setEmpoyee(Empoyee empoyee) {
        this.empoyee = empoyee;
    }

    @Override
    public String generateDailyReport() {
        if (empoyee.isAllow()) {
            org.yevgen.proxy.remote.ReportGenerator reportGenerator = null;
            try {
                reportGenerator = (ReportGenerator) Naming.lookup("rmi://127.0.0.1/RemoteReportGenerator");
                return reportGenerator.generateReport();
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        } else {
            return "Not Authorized to view report.";
        }
    }
}
