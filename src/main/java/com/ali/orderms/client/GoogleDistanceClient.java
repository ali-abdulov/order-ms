package com.ali.orderms.client;

import com.ali.orderms.dto.DistanceResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "google-distance-client", url = "https://maps.googleapis.com/maps/api/distancematrix")
public interface GoogleDistanceClient {

    @GetMapping("/json")
    DistanceResponseDto getDistance(
            @RequestParam("origins") String origins,
            @RequestParam("destinations") String destinations,
            @RequestParam("key") String apiKey
    );
}