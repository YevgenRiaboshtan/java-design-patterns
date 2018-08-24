package org.yevgen.template;

public class MySqlConnection extends ConnectionTemplate {
    @Override
    protected void setCredentials() {
        System.out.println("Set MySql credentials");
    }

    @Override
    protected void setDBDriver() {
        System.out.println("Set MySql DB driver");
    }
}
