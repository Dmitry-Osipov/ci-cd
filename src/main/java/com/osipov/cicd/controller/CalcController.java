package com.osipov.cicd.controller;

import com.osipov.cicd.service.CalcService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("calculator/")
public class CalcController {
    private final CalcService calcService;

    @GetMapping
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("add")
    public int add(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
        return calcService.add(a, b);
    }

    @GetMapping("sub")
    public int sub(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
        return calcService.sub(a, b);
    }

    @GetMapping("mul")
    public int mul(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
        return calcService.mul(a, b);
    }

    @GetMapping("div")
    public int div(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
        return calcService.div(a, b);
    }
}
