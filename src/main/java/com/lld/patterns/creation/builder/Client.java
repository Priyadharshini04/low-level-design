package com.lld.patterns.creation.builder;

public class Client {
    public static void main(String[] args)
    {
        Customer customer=new CustomerBuilder().setFirstName("Priyadharshini").setLastName("Vediyappan").build();
        System.out.println(customer.toString());
        OneCustomerForAll customer2=new OneCustomerForAll.OneCustomerForAllBuilder().setFirstName("Priya").setLastName("Appa").build();
        System.out.println(customer2.toString());
        StringBuilder sb=new StringBuilder(); // not thread safe.
        String str=sb.append("Yes").append(" No ").toString();
        System.out.println(str);
        StringBuffer sbb=new StringBuffer(); // thread safe due to synchronized append methods.
        sbb.append("Yes").append("YES");
        System.out.println(sbb);
    }
}
