package com.ali.orderms.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class CreateOrderRequest {
    private String pickupAddress;
    private String deliveryAddress;
    private BigDecimal distanceInKm;
}