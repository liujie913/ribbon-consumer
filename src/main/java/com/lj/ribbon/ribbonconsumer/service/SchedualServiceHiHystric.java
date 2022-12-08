package com.lj.ribbon.ribbonconsumer.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne() {
        return "sorry! 网络异常";
    }
}
