package com.kuaikan.sbtestfeign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xuehui at 2018-02-10
 */
@RestController
public class HiController {

    @Resource
    private ScheduleServiceHi scheduleServiceHi;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return scheduleServiceHi.sayHiFromClientOne(name);
    }

}
