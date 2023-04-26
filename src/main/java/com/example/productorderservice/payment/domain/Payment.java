package com.example.productorderservice.payment.domain;

import com.example.productorderservice.order.domain.Order;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public
class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Order order;
    private String cardNumber;
    public Payment(final Order order, final String cardNumber) {
        this.order = order;
        this.cardNumber = cardNumber;
    }

    public Order getOrder() {
        return order;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public int getPrice() {
        return order.getTotalPrice();
    }
}
