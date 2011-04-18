package edu.jhu.efoodcourt.struts.model;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectionPool {

	public static Connection getInstance() throws NamingException, SQLException  {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource datasource = (DataSource) context.getBean("eFoodCourtDS");
		Connection conn = datasource.getConnection();
		return conn;
	}
}
