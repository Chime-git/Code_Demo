package com.example.demo.openClosedPrinciple;

import org.springframework.stereotype.Component;

@Component
public class CashPayment extends PaymentImp {
    @Override
    public String pay() {
        return "CASH has been payed";
    }

    @Override
    public void setType() {
        this.type = PayType.CASH;
    }

}
