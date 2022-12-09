package com.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/dodorian")
public class ExampleController {
    private String p1;
    private String m1; // 마스터브렌치에서 추가함 -1
    private String m2; // 마스터브렌치에서 추가함 -2
    private String b1; // 브렌치따서 내용변경함 - 1
    private String b2; // 브렌치따서 내용변경함 - 2
    private String b3; // 브렌치따서 내용변경함 - 3
}
