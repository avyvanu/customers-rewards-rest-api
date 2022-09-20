package com.customer.customersrewardrestapi.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    KafkaTemplate<String, String> stringKafkaTemplate; //1

    @Autowired
    KafkaTemplate<String, Order> orderKafkaTemplate; //1

    private static final String MyHelloTopic = "myhellotopic"; //2
    private static final String MyOrderTopic="myordertopic"; //2

    public void sendMessage(String message) {
        System.out.println("TestService -sendMessage()");
        stringKafkaTemplate.send(MyHelloTopic, message); //3
    }

    public void sendOrder(Order myorder) {
        System.out.println("TestService -sendOrder()");
        orderKafkaTemplate.send(MyOrderTopic, myorder); //3
    }

}
