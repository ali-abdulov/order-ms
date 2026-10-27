package com.ali.orderms.mapper;

import com.ali.orderms.dto.OrderResponseDto;
import com.ali.orderms.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public OrderResponseDto toDto(Order order) {
        return OrderResponseDto.builder()
                .id(order.getId())
                .pickupAddress(order.getPickupAddress())
                .deliveryAddress(order.getDeliveryAddress())
                .courierId(order.getCourierId())
                .price(order.getPrice())
                .status(order.getStatus())
                .build();
    }
}