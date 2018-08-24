package org.yevgen.template;

public class Main {

    public static void main(String[] args) {
        ConnectionTemplate template = new MySqlConnection();
        template.process();
        System.out.println("-------------------");
        template = new OracleConnection();
        template.process();
    }
}
