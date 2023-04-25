package com.example.productorderservice.product;

record UpdateProductRequest(String name, int price, DiscountPolicy discountPolicy) {
}
