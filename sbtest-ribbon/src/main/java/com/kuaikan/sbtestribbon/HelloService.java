package com.kuaikan.sbtestribbon;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author xuehui at 2018-02-10
 */
@Service
public class HelloService {

    @Resource
    private RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SBTEST-CLIENT/hi?name=" + name, String.class);
    }
}
