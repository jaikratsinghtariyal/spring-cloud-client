package com.spring.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestController {

	@Value("${msg:Hello world - Config Server is not working..please check}")
    private String msg;
 
    @RequestMapping("/message")
    String getMsg() {
        return this.msg;
    }
}
