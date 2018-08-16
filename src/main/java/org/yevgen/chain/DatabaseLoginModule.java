package org.yevgen.chain;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DatabaseLoginModule implements LoginHandler {

    private LoginHandler loginHandler;
    private final Map<String, String> users;

    public DatabaseLoginModule(Map<String, String> users) {
        this.users = new HashMap<>();
        if (Objects.nonNull(users)) {
            this.users.putAll(users);
        }
    }

    @Override
    public void setLoginHandler(LoginHandler loginHandler) {
        this.loginHandler = loginHandler;
    }

    @Override
    public String login(String userName, String password) {
        if (users.entrySet().stream().anyMatch(entry -> ("" + entry.getKey()).equals(userName) && ("" + entry.getValue()).equals(password))) {
            return "User " + userName + " logged by DB";
        }
        if (Objects.nonNull(loginHandler)) {
            return loginHandler.login(userName, password);
        }
        return "User " + userName + " not found";
    }
}
