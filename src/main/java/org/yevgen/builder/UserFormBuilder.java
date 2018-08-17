package org.yevgen.builder;

import java.util.Date;

public class UserFormBuilder {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private Date birthday;
    private String country;
    private String city;
    private String street;
    private String buildNumber;
    private String flatNumber;
    private String email;
    private String phone;

    public UserFormBuilder(String firstName, String lastName, String userName, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public UserFormBuilder setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public UserFormBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    public UserFormBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public UserFormBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public UserFormBuilder setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
        return this;
    }

    public UserFormBuilder setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
        return this;
    }

    public UserFormBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserForm build() {
        UserForm userForm = new UserForm();
        userForm.setFirstName(firstName);
        userForm.setLastName(lastName);
        userForm.setUserName(userName);
        userForm.setPassword(password);
        userForm.setBirthday(birthday);
        userForm.setCountry(country);
        userForm.setCity(city);
        userForm.setStreet(street);
        userForm.setBuildNumber(buildNumber);
        userForm.setFlatNumber(flatNumber);
        userForm.setEmail(email);
        userForm.setPhone(phone);
        return userForm;
    }
}
