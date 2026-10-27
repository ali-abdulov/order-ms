package com.ali.orderms.client;

import com.ali.orderms.dto.CourierResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Component
@FeignClient(name = "courier-service", url = "${application.clients.courier-url}")
public interface CourierClient {

    @GetMapping("/api/v1/couriers/available")
    Optional<CourierResponseDto> getAvailableCourier();
}