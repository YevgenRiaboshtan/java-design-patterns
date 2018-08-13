package org.yevgen.proxy.protection;

import java.rmi.RemoteException;

public class Empoyee implements Staff {

    private final boolean isAllow;
    private ReportGenerator reportGenerator;

    private Empoyee(boolean isAllow) {
        this.isAllow = isAllow;
    }

    @Override
    public boolean isAllow() {
        return isAllow;
    }

    @Override
    public void setReportGenerator(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public String generateDailyReport() {
        try {
            return reportGenerator.generateReport();
        } catch (RemoteException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static Empoyee createEmployee() {
        return new Empoyee(false);
    }

    public static Empoyee createReportManager() {
        return new Empoyee(true);
    }
}
