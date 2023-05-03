package com.example.demo.openClosedPrinciple;

import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {
    private final static Map<PayType, Payment> paymentMap = new HashMap<>();

    public static Payment getPaymentByUserType(PayType type){
        return paymentMap.get(type);
    }

     protected static void register(PayType type, Payment paymentInter){
        Assert.notNull(type,"cannot be null");
        paymentMap.put(type, paymentInter);
    }
}
