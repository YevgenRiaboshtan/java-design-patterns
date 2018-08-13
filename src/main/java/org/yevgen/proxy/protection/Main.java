package org.yevgen.proxy.protection;

public class Main {

    public static void main(String[] args) {
        Empoyee empoyee = Empoyee.createEmployee();
        Empoyee reportManager = Empoyee.createReportManager();

        ReportGeneratorProxy reportGenerator = new ReportGeneratorProtectionProxy();

        ((ReportGeneratorProtectionProxy) reportGenerator).setEmpoyee(empoyee);
        System.out.println("Employee report: " + reportGenerator.generateDailyReport());

        ((ReportGeneratorProtectionProxy) reportGenerator).setEmpoyee(reportManager);
        System.out.println("ReportManager report: " + reportGenerator.generateDailyReport());
    }
}
