package com.lld.patterns.creation.builder;

public class OneCustomerForAll {
    private String firstName;
    private String middleName;
    private String lastName;
    private String primaryEmail;
    private String secondaryEmail;
    private String primaryMobileNumber;
    private String secondaryMobileNumber;

    public OneCustomerForAll(OneCustomerForAllBuilder oneCustomerForAllBuilder)
    {
        firstName=oneCustomerForAllBuilder.firstName;
        middleName=oneCustomerForAllBuilder.middleName;
        lastName=oneCustomerForAllBuilder.lastName;
        primaryEmail=oneCustomerForAllBuilder.primaryEmail;
        secondaryEmail=oneCustomerForAllBuilder.secondaryEmail;
        primaryMobileNumber=oneCustomerForAllBuilder.primaryMobileNumber;
        secondaryMobileNumber=oneCustomerForAllBuilder.secondaryMobileNumber;
    }
    static class OneCustomerForAllBuilder
    {
        private String firstName;
        private String middleName;
        private String lastName;
        private String primaryEmail;
        private String secondaryEmail;
        private String primaryMobileNumber;
        private String secondaryMobileNumber;
        public OneCustomerForAllBuilder() {
        }

        public OneCustomerForAll build()
        {
            return new OneCustomerForAll(this);
        }
        public OneCustomerForAllBuilder setFirstName(String firstName) {
            this.firstName=firstName;
            return this;
        }

        public OneCustomerForAllBuilder setLastName(String lastName) {
            this.lastName=lastName;
            return this;
        }

        public OneCustomerForAllBuilder setMiddleName(String middleName) {
            this.middleName=middleName;
            return this;
        }

        public OneCustomerForAllBuilder setPrimaryEmail(String primaryEmail) {
            this.primaryEmail=primaryEmail;
            return this;
        }

        public OneCustomerForAllBuilder setSecondaryEmail(String secondaryEmail) {
            this.secondaryEmail=secondaryEmail;
            return this;
        }

        public OneCustomerForAllBuilder setPrimaryMobileNumber(String primaryMobileNumber) {
            this.primaryMobileNumber=primaryMobileNumber;
            return this;
        }

        public OneCustomerForAllBuilder setSecondaryMobileNumber(String secondaryMobileNumber) {
            this.secondaryMobileNumber=secondaryMobileNumber;
            return this;
        }
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
