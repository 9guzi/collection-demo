package com.collection.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.collection.demo.service.DubboDemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboConsumerController {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345")
    private DubboDemoService dubboDemoService;

    /**
     * 测试
     *
     * @param param
     * @return
     */
    @RequestMapping("test")
    public String test(String param) {
        return dubboDemoService.test(param);
    }
}
