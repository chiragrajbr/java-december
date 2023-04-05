package com.example.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseController1 implements DatabaseController {
	@Autowired
 private JdbcTemplate jt;
	@Override
	public void insertdata() {
		// TODO Auto-generated method stub
	//	jt.update("insert into emp_details	values(110,'narasimha')");
	String a=	"insert into emp_details	values(110,'narasimha')";
	jt.update(a);
	}

}
