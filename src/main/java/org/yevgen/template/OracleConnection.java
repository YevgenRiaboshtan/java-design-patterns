package org.yevgen.template;

public class OracleConnection extends ConnectionTemplate {
    @Override
    protected void setCredentials() {
        System.out.println("Set Oracle credentials");
    }

    @Override
    protected void setDBDriver() {
        System.out.println("Set Oracle DB driver");
    }
}
