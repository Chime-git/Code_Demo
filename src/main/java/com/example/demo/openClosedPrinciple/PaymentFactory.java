package com.example.demo.openClosedPrinciple;

import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

public interface PaymentFactory {
    Map<PayType, Payment> paymentMap = new HashMap<>();

    static Payment getPaymentByUserType(PayType type){
        return paymentMap.get(type);
    }

     static void register(PayType type, Payment paymentInter){
        Assert.notNull(type,"cannot be null");
        paymentMap.put(type, paymentInter);
    }
}
