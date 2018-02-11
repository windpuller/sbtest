package com.kuaikan.sbtestfeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xuehui at 2018-02-10
 */
@FeignClient(value = "sbtest-client")
public interface ScheduleServiceHi {

    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
