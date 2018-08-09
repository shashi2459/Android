package com.android.shashi_sule.mvp_dagger_rx.mvp.model;

public class Employee {

    private String mId;
    private String mEmployeeName;
    private String mEmployeeSalary;
    private String mEmployeeAge;
    private String mProfileImage;

    private String getId() {
        return mId;
    }

    private void setId(final String id) {
        mId = id;
    }

    private String getEmployeeName() {
        return mEmployeeName;
    }

    private void setEmployeeName(final String employeeName) {
        mEmployeeName = employeeName;
    }

    private String getEmployeeSalary() {
        return mEmployeeSalary;
    }

    private void setEmployeeSalary(final String employeeSalary) {
        mEmployeeSalary = employeeSalary;
    }

    private String getEmployeeAge() {
        return mEmployeeAge;
    }

    private void setEmployeeAge(final String employeeAge) {
        mEmployeeAge = employeeAge;
    }

    private String getProfileImage() {
        return mProfileImage;
    }

    private void setProfileImage(final String profileImage) {
        mProfileImage = profileImage;
    }
}