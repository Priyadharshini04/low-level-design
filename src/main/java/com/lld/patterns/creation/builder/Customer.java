package com.lld.patterns.creation.builder;

public class Customer {
    private String firstName;
    private String middleName;
    private String lastName;
    private String primaryEmail;
    private String secondaryEmail;
    private String primaryMobileNumber;
    private String secondaryMobileNumber;

    public Customer(CustomerBuilder cb) {
        firstName=cb.getFirstName();
        middleName=cb.getMiddleName();
        lastName=cb.getLastName();
        primaryEmail=cb.getPrimaryEmail();
        secondaryEmail=cb.getSecondaryEmail();
        primaryMobileNumber=cb.getPrimaryMobileNumber();
        secondaryMobileNumber=cb.getSecondaryMobileNumber();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public String getPrimaryMobileNumber() {
        return primaryMobileNumber;
    }

    public String getSecondaryMobileNumber() {
        return secondaryMobileNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public void setPrimaryMobileNumber(String primaryMobileNumber) {
        this.primaryMobileNumber = primaryMobileNumber;
    }

    public void setSecondaryMobileNumber(String secondaryMobileNumber) {
        this.secondaryMobileNumber = secondaryMobileNumber;
    }

    @Override
    public String toString()
    {
        return "First Name: " + firstName + "\n" +
                "Middle Name: " + middleName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Primary Email: " + primaryEmail + "\n" +
                "Secondary Email: " + secondaryEmail + "\n" +
                "Primary Mobile Number: " + primaryMobileNumber + "\n" +
                "Secondary Mobile Number: " + secondaryMobileNumber + "\n";
    }
}
