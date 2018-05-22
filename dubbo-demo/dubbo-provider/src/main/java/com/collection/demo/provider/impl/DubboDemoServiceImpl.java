package com.collection.demo.provider.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.collection.demo.service.DubboDemoService;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DubboDemoServiceImpl implements DubboDemoService {
    @Override
    public String test(String param) {
        return param + "############" + Calendar.getInstance().getTime().toString();
    }
}
