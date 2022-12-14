package com.interview.practice.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBootApp implements CommandLineRunner {
    @Autowired
    CustomerDAO cdao;

    public static void main(String[] args) {
        SpringApplication.run(MyBootApp.class, args);
    }


    @Override
    public void run(String... args) {
        System.out.println("MyBootApp..run() method ----Starts");
        System.out.println("------------------------------------");

        // 1. addCustomer
        Customer cust1 = new Customer(9189, "vishnu", "vishnu@jlc", 123123123, "st Louis");
        cdao.addCustomer(cust1);

        // 2. getAllCustomers System.out.println("getAllCustomers"); List<Customer> list=cdao.getAllCustomers(); list.forEach(cust -> System.out.println(cust) );
        System.out.println("------------------------------------");
        System.out.println("MyBootApp..run() method ----- Ends");
    }
}