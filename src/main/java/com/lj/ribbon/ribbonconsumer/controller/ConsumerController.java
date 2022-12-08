package com.lj.ribbon.ribbonconsumer.controller;


import com.lj.ribbon.ribbonconsumer.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping("/ribbon-consumer")
    public String helloConsumer(){
        return  schedualServiceHi.sayHiFromClientOne();
    }
}
