package org.yevgen.template;

public abstract class ConnectionTemplate {

    public final void process() {
        setDBDriver();
        setCredentials();
        connect();
        prepareStatement();
        insert();
        close();
        destroy();
    }

    private void destroy() {
        System.out.println("Destroy");
    }

    private void close() {
        System.out.println("Close connection");
    }

    private void insert() {
        System.out.println("Insert");
    }

    private void prepareStatement() {
        System.out.println("Prepare statement");
    }

    private void connect() {
        System.out.println("Connect");
    }

    protected abstract void setCredentials();

    protected abstract void setDBDriver();
}
