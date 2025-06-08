package com.Library.StudentLibraryManagementDatabaseSystem.requestDto;

public class AuthorRequestDto {

    private String name;
    private String email;
    private String mobileNumer;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumer() {
        return mobileNumer;
    }

    public void setMobileNumer(String mobileNumer) {
        this.mobileNumer = mobileNumer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
