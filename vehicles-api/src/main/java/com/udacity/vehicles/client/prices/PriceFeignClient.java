package com.udacity.vehicles.client.prices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "pricing-service")
public interface PriceFeignClient {
    @GetMapping("/prices/{vehicleId}")
    Price getPrice(@PathVariable(name = "vehicleId") Long vehicleId);

//    @GetMapping("/services/price")
//    Price getPrice2(@RequestParam Long vehicleId);
}
