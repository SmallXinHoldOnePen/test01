package com.itpwan.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author Kevin pawn
 * @date 21/12/10 21:03
 */

@Component
@Data
@ToString
public class Book {
    private String name;//书名
    private Integer num;//数量
}
