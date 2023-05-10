package com.example.demo.openClosedPrinciple;

import java.util.HashMap;
import java.util.Map;

public class PaymentModeFactory {
    private final static Map<Mode, Payment> paymentModeMap = new HashMap<>();

    public static Payment getPaymentByMode(Mode mode){
        return paymentModeMap.get(mode);
    }

     protected static void register(Mode mode, Payment payment){
        paymentModeMap.put(mode, payment);
    }
}
