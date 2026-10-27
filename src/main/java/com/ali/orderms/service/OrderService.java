package com.ali.orderms.service;

import com.ali.orderms.client.CourierClient;
import com.ali.orderms.entity.Order;
import com.ali.orderms.mapper.OrderMapper;
import com.ali.orderms.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final CourierClient courierClient;
    private final OrderMapper orderMapper;

    public Optional<Order> getOrderById(String orderId) {
        
    }


}
