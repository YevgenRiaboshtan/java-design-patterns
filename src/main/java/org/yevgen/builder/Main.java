package org.yevgen.builder;

import java.util.Date;

public class Main {

    /*
    Use the Builder pattern when
    • The algorithm for creating a complex object should be independent of the parts that make up the object and how they’re
    assembled.
    • The construction process must allow different representations for the object that’s constructed.
     */
    public static void main(String[] args) {
        UserForm userForm = new UserForm.FormBuilder("Yevgen", "Riaboshtan", "yevgen", "secret", "yevgen@riaboshtan.com").build();
        System.out.println(userForm);

        userForm = new UserForm.FormBuilder("Yevgen", "Riaboshtan", "yevgen", "secret", "yevgen@riaboshtan.com")
                .setBirthday(new Date())
                .setPhone("111-222-333")
                .build();
        System.out.println(userForm);

        userForm = new UserFormBuilder("Yevgen", "Riaboshtan", "yevgen", "secret", "yevgen@riaboshtan.com")
                .setBirthday(new Date())
                .setPhone("444-555-666")
                .setCountry("Poland")
                .build();
        System.out.println(userForm);
    }
}
