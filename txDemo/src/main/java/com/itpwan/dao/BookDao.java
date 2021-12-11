package com.itpwan.dao;

import com.itpwan.pojo.Book;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Kevin pawn
 * @date 21/12/10 21:03
 */


@Repository()
public interface BookDao {

    @Select("select * from book")
    public List<Book> findAll();
}
