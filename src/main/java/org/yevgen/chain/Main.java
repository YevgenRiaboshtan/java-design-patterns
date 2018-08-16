package org.yevgen.chain;

import java.util.HashMap;
import java.util.Map;

public class Main {

    /*
    Use Chain of Responsibility when
    • More than one objects may handle a request, and the handler isn’t known a priori. The handler should be ascertained automatically.
    • You want to issue a request to one of several objects without specifying the receiver explicitly.
    • The set of objects that can handle a request should be specified dynamically.
     */
    public static void main(String[] args) {
        Map<String,String> dbUsers = new HashMap<>();
        dbUsers.put("user1", "pass1");
        dbUsers.put("user2", "pass2");
        dbUsers.put("user3", "pass3");

        Map<String, String> ldapUsers = new HashMap<>();
        ldapUsers.put("admin", "admin");

        LoginHandler db = new DatabaseLoginModule(dbUsers);
        LoginHandler ldap = new LdapLoginModule(ldapUsers);
        db.setLoginHandler(ldap);

        System.out.println(db.login("user1", "pass1"));
        System.out.println(db.login("admin", "admin"));
        System.out.println(db.login("user1", "pass2"));
    }
}
