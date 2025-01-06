package com.lld.patterns.creation.builder;

public interface ICustomerBuilder {
    ICustomerBuilder setFirstName(String firstName);
    ICustomerBuilder setLastName(String lastName);
    ICustomerBuilder setMiddleName(String middleName);
    ICustomerBuilder setPrimaryEmail(String primaryEmail);
    ICustomerBuilder setSecondaryEmail(String secondaryEmail);
    ICustomerBuilder setPrimaryMobileNumber(String primaryMobileNumber);
    ICustomerBuilder setSecondaryMobileNumber(String secondaryMobileNumber);
    String getFirstName();
    String getLastName();
    String getMiddleName();
    String getPrimaryEmail();
    String getSecondaryEmail();
    String getPrimaryMobileNumber();
    String getSecondaryMobileNumber();
}
