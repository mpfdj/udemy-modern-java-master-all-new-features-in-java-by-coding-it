package com.modernjava.payment;

import com.modernjava.domain.Card;
import com.modernjava.domain.PaymentResponse;

public final class DebitCardPayment extends PaymentGateway {

    @Override
    public PaymentResponse makePayment(Card card, double amount) {
        System.out.println("Acquire Debit Card Payment for the amount = " + amount);
        return PaymentResponse.SUCCESS;
    }
}
