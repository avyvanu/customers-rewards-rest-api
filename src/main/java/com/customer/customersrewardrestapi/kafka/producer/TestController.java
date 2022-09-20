package com.customer.customersrewardrestapi.kafka.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @Value(value = "${kafka.bootstrapAddress}")
    private String bootstrapAddress;


    @GetMapping("/testMsg")
    public String testMessage() {
        System.out.println("---TestController---testMessage()---");
        testService.sendMessage("Hello Guys - This is message 1");
        testService.sendMessage("Hello Guys - This is message 2");
        return "String Message Sent to Kafka Server @ " + bootstrapAddress;
    }


    @GetMapping("/testOrder")
    public String placeOrder() {
        System.out.println("---TestController---placeOrder()---");
        Order myorder = new Order(5001, "19-Dec-2020", "C-101", 5, 500, "New");
        testService.sendOrder(myorder);
        testService.sendOrder(myorder);
        return "Order Sent to Kafka Server @ " + bootstrapAddress;
    }

}
