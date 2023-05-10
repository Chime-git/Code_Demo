package com.example.demo.openClosedPrinciple;

import org.springframework.beans.factory.InitializingBean;

public abstract class PaymentImpl implements Payment, InitializingBean {
    protected Mode mode;

    public abstract void setMode();

    @Override
    public void afterPropertiesSet(){
        setMode();
        PaymentModeFactory.register(this.mode,this);
    }
}
