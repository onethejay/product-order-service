package com.example.productorderservice.product;

public enum DiscountPolicy {
    NONE {
        @Override
        int applyDiscount(int price) {
            return price;
        }
    };

    abstract int applyDiscount(final int price);
}
