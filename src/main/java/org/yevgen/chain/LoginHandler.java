package org.yevgen.chain;

public interface LoginHandler {

    void setLoginHandler(LoginHandler loginHandler);

    String login(String userName, String password);
}
