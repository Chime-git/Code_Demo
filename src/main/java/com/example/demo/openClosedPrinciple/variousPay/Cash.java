package com.example.demo.openClosedPrinciple.variousPay;

import com.example.demo.openClosedPrinciple.Mode;
import com.example.demo.openClosedPrinciple.PaymentImpl;
import org.springframework.stereotype.Component;

@Component
public class Cash extends PaymentImpl {
    @Override
    public String pay() {
        return "CASH";
    }

    @Override
    public void setMode() {
        this.mode = Mode.CASH;
    }

}
