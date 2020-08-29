package com.devwhs.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@ResponseBody를 모든 메서드에 적용
public class WebRestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!"; //"Hello World!" 를 JSON 형태로 반환
    }
}
