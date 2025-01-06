package com.lld.patterns.creation.builder;

public class CustomerBuilder implements ICustomerBuilder{
    private String firstName;
    private String middleName;
    private String lastName;
    private String primaryEmail;
    private String secondaryEmail;
    private String primaryMobileNumber;
    private String secondaryMobileNumber;

    public CustomerBuilder() {
    }

    public Customer build()
    {
        return new Customer(this);
    }
    @Override
    public CustomerBuilder setFirstName(String firstName) {
        this.firstName=firstName;
        return this;
    }

    @Override
    public CustomerBuilder setLastName(String lastName) {
        this.lastName=lastName;
        return this;
    }

    @Override
    public CustomerBuilder setMiddleName(String middleName) {
        this.middleName=middleName;
        return this;
    }

    @Override
    public CustomerBuilder setPrimaryEmail(String primaryEmail) {
        this.primaryEmail=primaryEmail;
        return this;
    }

    @Override
    public CustomerBuilder setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail=secondaryEmail;
        return this;
    }

    @Override
    public CustomerBuilder setPrimaryMobileNumber(String primaryMobileNumber) {
        this.primaryMobileNumber=primaryMobileNumber;
        return this;
    }

    @Override
    public CustomerBuilder setSecondaryMobileNumber(String secondaryMobileNumber) {
        this.secondaryMobileNumber=secondaryMobileNumber;
        return this;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getMiddleName() {
        return this.middleName;
    }

    @Override
    public String getPrimaryEmail() {
        return this.primaryEmail;
    }

    @Override
    public String getSecondaryEmail() {
        return this.secondaryEmail;
    }

    @Override
    public String getPrimaryMobileNumber() {
        return this.primaryMobileNumber;
    }

    @Override
    public String getSecondaryMobileNumber() {
        return this.secondaryMobileNumber;
    }

}
