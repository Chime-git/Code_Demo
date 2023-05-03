package com.example.demo.openClosedPrinciple;

import org.springframework.beans.factory.InitializingBean;

public abstract class PaymentImp implements Payment, InitializingBean {
    protected PayType type;

    public abstract void setType();

    @Override
    public void afterPropertiesSet(){
        setType();
        PaymentFactory.register(this.type,this);
    }
}
