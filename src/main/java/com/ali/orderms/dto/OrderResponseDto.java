package com.ali.orderms.dto;

import com.ali.orderms.enums.OrderStatus;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class OrderResponseDto {
    private Long id;
    private String pickupAddress;
    private String deliveryAddress;
    private Long courierId;
    private BigDecimal price;
    private OrderStatus status;
}
