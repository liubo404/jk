package com.zx.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public static final String ADD_USER="insert into t_user(id,name) values(1,'duck')";  
    
    @Autowired
    private BookService bs;  
    @Autowired
    private JdbcTemplate jdbcTemplate;  
      
    public void addUser()throws Exception {  
        this.bs.addBook();  
        this.jdbcTemplate.execute(ADD_USER);  
    }  
  
    public JdbcTemplate getJdbcTemplate() {  
        return jdbcTemplate;  
    }  
  
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
        this.jdbcTemplate = jdbcTemplate;  
    }  
  
    public BookService getBs() {  
        return bs;  
    }  
  
    public void setBs(BookService bs) {  
        this.bs = bs;  
    }  
}
