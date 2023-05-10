package com.example.demo.openClosedPrinciple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

    @GetMapping("/testOCP")
    public String testOCP(@RequestParam(value = "type") String type){
        Payment payment = PaymentModeFactory.getPaymentByMode(Mode.valueOf(type.toUpperCase()));
        return  payment.pay() ;
    }
}
