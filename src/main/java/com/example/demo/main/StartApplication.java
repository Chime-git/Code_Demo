package com.example.demo.main;

import com.example.demo.openClosedPrinciple.PayType;
import com.example.demo.openClosedPrinciple.Payment;
import com.example.demo.openClosedPrinciple.PaymentFactory;
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
        Payment payment = PaymentFactory.getPaymentByUserType(PayType.valueOf(type.toUpperCase()));
        return  payment.pay() ;
    }
}
