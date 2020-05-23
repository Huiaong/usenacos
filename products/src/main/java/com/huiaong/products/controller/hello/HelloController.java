package com.huiaong.products.controller.hello;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huiaong.api.hello.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :  Hujc
 * @version : 1.0.0
 * @date : 2020/5/21/0021 10:08
 * @description :
 */
@RestController
@RequestMapping("/api/hello")
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    private String sayHello(@RequestParam String name){
        return helloService.sayHello(name);
    }

}
