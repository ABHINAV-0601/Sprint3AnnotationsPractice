package com.demo;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("customer")
    public Customer getCustomerDetails(){
        Customer customer = new Customer();
        customer.setCustId(101);
        customer.setCustName("Abhinav Pandey");
        return customer;
    }

    @Bean
    public Address getAddress(){
        return new Address("Varanasi","UP","India");
    }
}
