package com.example.productorderservice.payment;

import com.example.productorderservice.order.Order;

class Payment {
    private final Order order;
    private final String cardNumber;

    public Long getId() {
        return id;
    }

    private Long id;

    public Payment(final Order order, final String cardNumber) {
        this.order = order;
        this.cardNumber = cardNumber;
    }

    public void assignId(Long id) {
        this.id = id;
    }

    public int getPrice() {
        order.getTotalPrice();
    }
}
