package com.example.demo.openClosedPrinciple.variousPay;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CashTest {


    @Autowired
    private Cash cash;

    @Test
    void isCashPayEqualsCash() {
        Assertions.assertSame("CASH", cash.pay());

    }
}