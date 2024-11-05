package com.example.demo.service;

import com.example.demo.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName    : com.example.demo.service
 * fileName       : UserService
 * author         : "Yeongdeok.Cho"
 * date           : 2024/11/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/11/05        "Yeongdeok.Cho"       최초 생성
 */
@Service
@RequiredArgsConstructor
public class UserService {
    public UserDto getUserNo() {
        UserDto userDto = UserDto.builder()
                .userNo("82265604")
                .build();
        return userDto;
    }
}
