package com.Library.StudentLibraryManagementDatabaseSystem.requestDto;


public class StudentRequestDto {
    private String name;
    private String email;
    private String mobileNumer;
    private String department;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
