package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * packageName    : com.example.demo.dto
 * fileName       : UserDto
 * author         : "Yeongdeok.Cho"
 * date           : 2024/11/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/11/05        "Yeongdeok.Cho"       최초 생성
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String userNo;
}
