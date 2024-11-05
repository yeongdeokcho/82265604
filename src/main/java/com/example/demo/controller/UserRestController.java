package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.example.demo.controller
 * fileName       : UserRestController
 * author         : "Yeongdeok.Cho"
 * date           : 2024/11/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/11/05        "Yeongdeok.Cho"       최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/api/v1")
public class UserRestController {

    @Autowired
    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public UserDto getUserNo() {
        return userService.getUserNo();
    }
}
