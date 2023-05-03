package com.example.demo.openClosedPrinciple.variousPay;

import com.example.demo.openClosedPrinciple.PayType;
import com.example.demo.openClosedPrinciple.PaymentImp;
import org.springframework.stereotype.Component;

@Component
public class Cash extends PaymentImp {
    public Cash(){
        System.out.println("this is Cashpayment");
    }
    @Override
    public String pay() {
        return "CASH has been payed";
    }

    @Override
    public void setType() {
        this.type = PayType.CASH;
    }

}
