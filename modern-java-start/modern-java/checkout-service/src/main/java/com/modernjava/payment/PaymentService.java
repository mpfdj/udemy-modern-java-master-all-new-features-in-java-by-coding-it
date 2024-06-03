package com.modernjava.payment;

import com.modernjava.domain.OrderDetails;
import com.modernjava.domain.PaymentResponse;

public class PaymentService {

    public PaymentResponse makePayment(OrderDetails orderDetails) {


        //implement a payment gateway that can handle the different kinds of payment.
        var paymentGateway = PaymentFactory.paymentGateway(orderDetails.card().cardType());
        return paymentGateway.makePayment(orderDetails.card(), orderDetails.finalAmount());

//        return PaymentResponse.SUCCESS;
    }
}
