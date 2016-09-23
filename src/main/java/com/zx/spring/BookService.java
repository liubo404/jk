package com.zx.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    public static final String ADD_BOOK = "insert into t_book(id,name) values(1,'duck-j2ee')";
    @Autowired
    private JdbcTemplate jdbcTemplate;

 /*   public void addBook() throws Exception {
        this.jdbcTemplate.execute(ADD_BOOK);
        throw new RollbackException("跳出执行");
    }*/
    
    public void addBook() throws Exception{
        this.jdbcTemplate.execute(ADD_BOOK);
//        throw new Exception("throw runtime exception in outter transaction");
        throw new RuntimeException("跳出执行");  
    }
    

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
