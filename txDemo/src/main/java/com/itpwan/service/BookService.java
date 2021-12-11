package com.itpwan.service;

import com.itpwan.dao.BookDao;
import com.itpwan.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kevin pawn
 * @date 21/12/10 21:03
 */

@Service
public class BookService {

    @Autowired(required = true)
    private BookDao bookDao;

    public List<Book> findAll(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        return bookDao.findAll();
    }
}
