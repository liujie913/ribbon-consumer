package com.lj.ribbon.ribbonconsumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "HELLO-SERVICE", fallback = SchedualServiceHiHystric.class)
@Component
public interface SchedualServiceHi {

    @GetMapping(value = "/hello")
    String sayHiFromClientOne();
}
