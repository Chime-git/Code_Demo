package com.example.demo.openClosedPrinciple.controller;

import com.example.demo.openClosedPrinciple.Mode;
import com.example.demo.openClosedPrinciple.Payment;
import com.example.demo.openClosedPrinciple.PaymentModeFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/pay")
public class PaymentController {

    @GetMapping("/get")
    public String getPay(@RequestParam(value = "mode") String mode){
        Payment payment = PaymentModeFactory.getPaymentByMode(Mode.valueOf(mode.toUpperCase()));
        return  "Pay result is - "  + payment.pay() ;
    }

}
