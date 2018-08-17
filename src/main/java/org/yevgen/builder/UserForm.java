package org.yevgen.builder;

import java.util.Date;
import java.util.Objects;

public class UserForm {
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

    public static class FormBuilder {
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

        public FormBuilder(String firstName, String lastName, String userName, String password, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.userName = userName;
            this.password = password;
            this.email = email;
        }

        public FormBuilder setBirthday(Date birthday) {
            this.birthday = birthday;
            return this;
        }

        public FormBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public FormBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public FormBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public FormBuilder setBuildNumber(String buildNumber) {
            this.buildNumber = buildNumber;
            return this;
        }

        public FormBuilder setFlatNumber(String flatNumber) {
            this.flatNumber = flatNumber;
            return this;
        }

        public FormBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserForm build() {
            return new UserForm(this);
        }
    }

    public UserForm() {
    }

    private UserForm(FormBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.userName = builder.userName;
        this.password = builder.password;
        this.birthday = builder.birthday;
        this.country = builder.country;
        this.city = builder.city;
        this.street = builder.street;
        this.buildNumber = builder.buildNumber;
        this.flatNumber = builder.flatNumber;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserForm{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                (Objects.nonNull(birthday) ? (", birthday=" + birthday) : "") +
                (Objects.nonNull(country) ? (", country=" + country) : "") +
                (Objects.nonNull(city) ? (", city=" + city) : "") +
                (Objects.nonNull(street) ? (", street=" + street) : "") +
                (Objects.nonNull(buildNumber) ? (", buildNumber=" + buildNumber) : "") +
                (Objects.nonNull(flatNumber) ? (", flatNumber=" + flatNumber) : "") +
                (Objects.nonNull(phone) ? (", phone=" + phone) : "") +
                '}';
    }
}
